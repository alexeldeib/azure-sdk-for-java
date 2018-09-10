# Azure Application Insights

This project provides client tools or utilities in Java that make it easy to query data in [Azure Application Insights](https://azure.microsoft.com/en-us/services/application-insights/). For reference documentation on classes and models, please see the [Azure SDK for Java reference](https://docs.microsoft.com/en-us/java/api/overview/azure/?view=azure-java-stable). 

Azure Application Insights provides SDKs for telemtry collection and enables deep analytics via a [rich query language](https://docs.loganalytics.io/index). This SDK provides query access to data already stored in Application Insights. To start monitoring a Java application, take a look at the [quickstart](https://docs.microsoft.com/en-us/azure/application-insights/app-insights-java-quick-start). 

## Example

```java
package com.demo.app;

import java.util.ArrayList;
import java.util.List;
import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.applicationinsights.query.implementation.ApplicationInsightsDataClientImpl;
import com.microsoft.azure.applicationinsights.query.models.QueryBody;
import com.microsoft.azure.applicationinsights.query.models.MetricId;
import com.microsoft.azure.applicationinsights.query.models.MetricsResult;
import com.microsoft.azure.applicationinsights.query.models.MetricsResultsItem;
import com.microsoft.azure.applicationinsights.query.models.MetricsPostBodySchema;
import com.microsoft.azure.applicationinsights.query.models.MetricsPostBodySchemaParameters;
import com.microsoft.azure.applicationinsights.query.models.EventType;
import com.microsoft.azure.applicationinsights.query.models.EventsResult;
import com.microsoft.azure.applicationinsights.query.models.EventsResults;
import com.microsoft.azure.applicationinsights.query.models.QueryResults;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;

/**
 * Basic query example
 *
 */
public class ApplicationInsightsClientExample 
{
    public static void main( String[] args )
    {
        // ApplicationTokenCredentials work well for service principal authentication
        ApplicationTokenCredentials credentials = new ApplicationTokenCredentials(
            "<clientId>",
            "<tenantId>",
            "<clientSecret>",
            AzureEnvironment.AZURE
        );
        
        // New up client. Accepts credentials, or a pre-authenticated restClient
        ApplicationInsightsDataClientImpl client = new ApplicationInsightsDataClientImpl(credentials);
        
        // Prepare information for query
        String query = "availabilityResults | take 1";
        String appId = "<appInsightsAppGUID>";
        String eventId = "<eventGuid>";

        // POST parameters for multiple metrics
        List<MetricsPostBodySchema> parameters = new ArrayList<MetricsPostBodySchema>();
        parameters.add(new MetricsPostBodySchema().withId("1").withParameters(new MetricsPostBodySchemaParameters().withMetricId(MetricId.AVAILABILITY_RESULTSAVAILABILITY_PERCENTAGE)));
        parameters.add(new MetricsPostBodySchema().withId("2").withParameters(new MetricsPostBodySchemaParameters().withMetricId(MetricId.AVAILABILITY_RESULTSDURATION)));

        // Execute log query
        QueryResults queryResults = client.querys().execute(appId, new QueryBody().withQuery(query));
        
        // Metrics
        MetricsResult metricResultSingle = client.metrics().get(appId, MetricId.AVAILABILITY_RESULTSAVAILABILITY_PERCENTAGE);
        List<MetricsResultsItem> metricResultMultiple = client.metrics().getMultiple(appId, parameters);
        Object metadata = client.metrics().getMetadata(appId);

        // Events
        EventsResults eventsResultByType = client.events().getByType(appId, EventType.AVAILABILITY_RESULTS);
        EventsResults eventsResult = client.events().get(appId, EventType.AVAILABILITY_RESULTS, eventId);

        // Process and print query results results
        List<Object> row = queryResults.tables().get(0).rows().get(0);
        List<String> columnNames = queryResults
            .tables()
            .get(0)
            .columns()
            .stream()
            .map(elt -> elt.name())
            .collect(Collectors.toList());

        for (int i = 0; i < row.size(); i++){        
            System.out.println("The value of " + columnNames.get(i) + " is " + row.get(i));
        }
        
        System.out.println(metricResultMultiple..value().additionalProperties());
        
    }
}

```

## Download

### Latest release

To get the binaries of the official Microsoft Azure Log Analytics SDK as distributed by Microsoft, reade for use within your project, you can use Maven.

```xml
<dependency>
    <groupId>com.microsoft.azure</groupId>
    <artifactId>azure-applicationinsights-query</artifactId>
    <version>LATEST</version>
</dependency>
```

## Prerequisites

- A Java Developer Kit (JDK), v 1.7 or later
- Maven

## Help and Issues

If you encounter any bugs with these SDKs, please file issues via [Issues](https://github.com/Azure/azure-sdk-for-java/issues) or checkout [StackOverflow for Azure Java SDK](http://stackoverflow.com/questions/tagged/azure-java-sdk).

## Contribute Code

If you would like to become an active contributor to this project please follow the instructions provided in [Microsoft Azure Projects Contribution Guidelines](http://azure.github.io/guidelines.html).

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

## More information
- [Azure Java SDKs](https://docs.microsoft.com/java/azure/)
- If you don't have a Microsoft Azure subscription you can get a FREE trial account [here](http://go.microsoft.com/fwlink/?LinkId=330212)

---

This project has adopted the [Microsoft Open Source Code of Conduct](https://opensource.microsoft.com/codeofconduct/). For more information see the [Code of Conduct FAQ](https://opensource.microsoft.com/codeofconduct/faq/) or contact [opencode@microsoft.com](mailto:opencode@microsoft.com) with any additional questions or comments.