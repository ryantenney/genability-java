package com.genability.client.types;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class TariffProperty {

  private String keyName;
  private String displayName;
  private String family;
  private String keyspace;
  private String description;
  private String dataType;
  private TariffPropertyType propertyTypes;
  private String operator;
  private String propertyValue;
  private String quantityUnit;
  private String minValue;
  private String maxValue;
  private List<Choice> choices;
  private String period;
  private String formulaDetail;
  private Boolean isDefault;
  
  public String getKeyName() {
    return keyName;
  }
  
  public void setKeyName(String keyName) {
    this.keyName = keyName;
  }
  
  public String getDisplayName() {
    return displayName;
  }
  
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }
  
  public String getFamily() {
    return family;
  }
  
  public void setFamily(String family) {
    this.family = family;
  }
  
  public String getKeyspace() {
    return keyspace;
  }
  
  public void setKeyspace(String keyspace) {
    this.keyspace = keyspace;
  }
  
  public String getDescription() {
    return description;
  }
  
  public void setDescription(String description) {
    this.description = description;
  }
  
  public String getDataType() {
    return dataType;
  }
  
  public void setDataType(String dataType) {
    this.dataType = dataType;
  }
  
  public TariffPropertyType getPropertyTypes() {
    return propertyTypes;
  }
  
  public void setPropertyTypes(TariffPropertyType propertyTypes) {
    this.propertyTypes = propertyTypes;
  }
  
  public String getOperator() {
    return operator;
  }
  
  public void setOperator(String operator) {
    this.operator = operator;
  }
  
  public String getPropertyValue() {
    return propertyValue;
  }
  
  public void setPropertyValue(String propertyValue) {
    this.propertyValue = propertyValue;
  }
  
  public String getQuantityUnit() {
    return quantityUnit;
  }
  
  public void setQuantityUnit(String quantityUnit) {
    this.quantityUnit = quantityUnit;
  }
  
  public String getMinValue() {
    return minValue;
  }
  
  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }
  
  public String getMaxValue() {
    return maxValue;
  }
  
  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }
  
  public List<Choice> getChoices() {
    return choices;
  }
  
  public void setChoices(List<Choice> choices) {
    this.choices = choices;
  }

  public String getPeriod() {
    return period;
  }
  
  public void setPeriod(String period) {
    this.period = period;
  }
  
  public String getFormulaDetail() {
    return formulaDetail;
  }
  
  public void setFormulaDetail(String formulaDetail) {
    this.formulaDetail = formulaDetail;
  }
  
  public Boolean getIsDefault() {
    return isDefault;
  }
  
  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }
  
}
