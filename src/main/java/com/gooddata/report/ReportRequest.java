package com.gooddata.report;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.annotate.JsonTypeName;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonTypeInfo(include = JsonTypeInfo.As.WRAPPER_OBJECT, use = JsonTypeInfo.Id.NAME)
@JsonTypeName("report_req")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ReportRequest {

    public static final String URI = "/gdc/xtab2/executor3";

    @JsonProperty("reportDefinition")
    private final String reportDefinitionUri;

    public ReportRequest(String reportDefinitionUri) {
        this.reportDefinitionUri = reportDefinitionUri;
    }

    public String getReportDefinitionUri() {
        return reportDefinitionUri;
    }
}