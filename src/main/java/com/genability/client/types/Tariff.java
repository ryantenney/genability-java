package com.genability.client.types;

import java.math.BigDecimal;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.genability.client.util.EnumUtil;

@JsonIgnoreProperties(ignoreUnknown=true)
@JsonInclude(Include.NON_NULL)
public class Tariff {


	public static final String REST_TYPE = "Tariff";

    
	/**
	 * private member variable for TariffId.
	 */
	private Long tariffId;

	/**
	 * private member variable for MasterTariffId.
	 */
	private Long masterTariffId;
	
	/**
	 * private member variable for TariffCode.
	 */
	private String tariffCode;

	/**
	 * private member variable for TariffName.
	 */
	private String tariffName;

	/**
	 * private member variable for TariffBookName.
	 */
	private String tariffBookName;

	/**
	 * private member variable for LseId.
	 */
	private Long lseId;

	/**
	 * private member variable for LseName.
	 */
	private String lseName;

	/**
	 * private member variable for ServiceType.
	 */
	private ServiceType serviceType;

	/**
	 * private member variable for PriorTariffId.
	 */
	private Long priorTariffId;

	/**
	 * private member variable for DistributionLseId.
	 */
	private Long distributionLseId;

	/**
	 * private member variable for TariffType.
	 */
	private TariffType tariffType;

	/**
	 * private member variable for CustomerClass.
	 */
	private CustomerClass customerClass;

	/**
	 * private member variable for CustomerCount.
	 */
	private Integer customerCount;

	/**
	 * private member variable for CustomerLikelihood.
	 */
	private BigDecimal customerLikelihood;

	/**
	 * private member variable for CustomerCountSource.
	 */
	private String customerCountSource;

	/**
	 * private member variable for TerritoryId.
	 */
	private Long territoryId;

	/**
	 * private member variable for EffectiveDate.
	 */
	private String effectiveDate;

	/**
	 * private member variable for EndDate.
	 */
	private String endDate;

	/**
	 * private member variable for the time zone for this tariff.
	 */
	private String timeZone;

	/**
	 * private member variable for BillingPeriod. the default value is MONTHLY
	 */
	private Period billingPeriod;

	/**
	 * private member variable for Currency
	 */
	private String currency;
	
	/**
	 * private member variable for ChargeTypes
	 */
	private ChargeType[] chargeTypes;

	/**
	 * private member variable for ChargePeriod. the default value is MONTHLY
	 */
	private String chargePeriod;

	/**
	 * private member variable for minimum monthly consumption
	 * required to be eligible for this tariff
	 */
	private BigDecimal minMonthlyConsumption;
	
	/**
	 * private member variable for maximum monthly consumption
	 * required to be eligible for this tariff
	 */
	private BigDecimal maxMonthlyConsumption;
	
	/**
	 * private member variable for minimum monthly demand
	 * required to be eligible for this tariff
	 */
	private BigDecimal minMonthlyDemand;
	
	/**
	 * private member variable for maximum monthly demand
	 * required to be eligible for this tariff
	 */
	private BigDecimal maxMonthlyDemand;
	
	/**
	 * private member variable for whether this tariff
	 * has time of use rates or not
	 */
	private Boolean hasTimeOfUseRates;

	/**
	 * private member variable for whether this tariff
	 * has tiered rates or not
	 */
	private Boolean hasTieredRates;

	/**
	 * private member variable for whether this tariff
	 * has contracted rates or not
	 */
	private Boolean hasContractedRates;

	/**
	 * private member variable for whether this tariff
	 * has additional eligibility criteria, specified by tariff properties
	 */
	private Boolean hasTariffApplicability;

	/**
	 * private member variable for whether this tariff
	 * has additional eligibility criteria, specified by tariff properties
	 */
	private Boolean hasRateApplicability;

	/**
	 * private member variable for whether this tariff
	 * has net metered tariff rates or not
	 */
	private Boolean hasNetMetering;

	/**
	 * private member variable for the isActive flag.
	 */
	private Boolean isActive;

	/**
	 * private member variable for Privacy.
	 */
	private String privacy;

	/**
	 * private member variable for Properties.
	 */
	private List<TariffProperty> properties;

	/**
	 * private member variable for Properties.
	 */
	private List<TariffRate> rates;
	
	/**
	 * @return the tariffId
	 */
	public Long getTariffId() {
		return tariffId;
	}

	/**
	 * @param tariffId the tariffId to set
	 */
	public void setTariffId(Long tariffId) {
		this.tariffId = tariffId;
	}

	/**
	 * @return the masterTariffId
	 */
	public Long getMasterTariffId() {
		return masterTariffId;
	}

	/**
	 * @param masterTariffId the masterTariffId to set
	 */
	public void setMasterTariffId(Long masterTariffId) {
		this.masterTariffId = masterTariffId;
	}

	/**
	 * @return the priorTariffId
	 */
	public Long getPriorTariffId() {
		return priorTariffId;
	}

	/**
	 * @param priorTariffId the priorTariffId to set
	 */
	public void setPriorTariffId(Long priorTariffId) {
		this.priorTariffId = priorTariffId;
	}

	/**
	 * @return the lseId
	 */
	public Long getLseId() {
		return lseId;
	}

	/**
	 * @param lseId the lseId to set
	 */
	public void setLseId(Long lseId) {
		this.lseId = lseId;
	}

	/**
	 * @return the lseName
	 */
	public String getLseName() {
		return lseName;
	}

	/**
	 * @param lseName the lseName to set
	 */
	public void setLseName(String lseName) {
		this.lseName = lseName;
	}

	/**
	 * @return the distributionLseId
	 */
	public Long getDistributionLseId() {
		return distributionLseId;
	}

	/**
	 * @param distributionLseId the distributionLseId to set
	 */
	public void setDistributionLseId(Long distributionLseId) {
		this.distributionLseId = distributionLseId;
	}

	/**
	 * @return the tariffCode
	 */
	public String getTariffCode() {
		return tariffCode;
	}

	/**
	 * @param tariffCode the tariffCode to set
	 */
	public void setTariffCode(String tariffCode) {
		this.tariffCode = tariffCode;
	}

	/**
	 * @return the tariffName
	 */
	public String getTariffName() {
		return tariffName;
	}

	/**
	 * @param tariffName the tariffName to set
	 */
	public void setTariffName(String tariffName) {
		this.tariffName = tariffName;
	}

	/**
	 * @return the tariffBookName
	 */
	public String getTariffBookName() {
		return tariffBookName;
	}

	/**
	 * @param tariffBookName the tariffBookName to set
	 */
	public void setTariffBookName(String tariffBookName) {
		this.tariffBookName = tariffBookName;
	}

	/**
	 * @return the tariffType
	 */
	public TariffType getTariffType() {
		return tariffType;
	}

	/**
	 * @param tariffType the tariffType to set
	 */
	public void setTariffType(TariffType tariffType) {
		this.tariffType = tariffType;
	}

	/**
	 * @return the billingPeriod
	 */
	public Period getBillingPeriod() {
		return billingPeriod;
	}

	/**
	 * @param billingPeriod the billingPeriod to set
	 */
	public void setBillingPeriod(Period billingPeriod) {
		this.billingPeriod = billingPeriod;
	}

	/**
	 * @return the customerClass
	 */
	public CustomerClass getCustomerClass() {
		return customerClass;
	}

	/**
	 * @param customerClass the customerClass to set
	 */
	public void setCustomerClass(CustomerClass customerClass) {
		this.customerClass = customerClass;
	}

	/**
	 * @return the territoryId
	 */
	public Long getTerritoryId() {
		return territoryId;
	}

	/**
	 * @param territoryId the territoryId to set
	 */
	public void setTerritoryId(Long territoryId) {
		this.territoryId = territoryId;
	}

	/**
	 * @return the effectiveDate
	 */
	public String getEffectiveDate() {
		return effectiveDate;
	}

	/**
	 * @param effectiveDate the effectiveDate to set
	 */
	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	/**
	 * @return the endDate
	 */
	public String getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the timezone
	 */
	public String getTimeZone() {
		return timeZone;
	}

	/**
	 * @param timezone the timezone to set
	 */
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	/**
	 * @return the isActive
	 */
	public Boolean getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	/**
	 * @return the isoCurrency
	 */
	public String getCurrency() {
		return currency;
	}

	/**
	 * @param isoCurrency the isoCurrency to set
	 */
	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getMinMonthlyConsumption() {
    	return minMonthlyConsumption;
    }

	public void setMinMonthlyConsumption(BigDecimal minMonthlyConsumption) {
    	this.minMonthlyConsumption = minMonthlyConsumption;
    }

	public BigDecimal getMaxMonthlyConsumption() {
    	return maxMonthlyConsumption;
    }

	public void setMaxMonthlyConsumption(BigDecimal maxMonthlyConsumption) {
    	this.maxMonthlyConsumption = maxMonthlyConsumption;
    }

	public BigDecimal getMinMonthlyDemand() {
    	return minMonthlyDemand;
    }

	public void setMinMonthlyDemand(BigDecimal minMonthlyDemand) {
    	this.minMonthlyDemand = minMonthlyDemand;
    }

	public BigDecimal getMaxMonthlyDemand() {
    	return maxMonthlyDemand;
    }

	public void setMaxMonthlyDemand(BigDecimal maxMonthlyDemand) {
    	this.maxMonthlyDemand = maxMonthlyDemand;
	}

	public Boolean getHasNetMetering() {
    	return hasNetMetering;
    }

	public void setHasNetMetering(Boolean hasNetMetering) {
    	this.hasNetMetering = hasNetMetering;
    }

  public ServiceType getServiceType() {
    return serviceType;
  }

  public void setServiceType(ServiceType serviceType) {
    this.serviceType = serviceType;
  }

  public Integer getCustomerCount() {
    return customerCount;
  }

  public void setCustomerCount(Integer customerCount) {
    this.customerCount = customerCount;
  }

  public BigDecimal getCustomerLikelihood() {
    return customerLikelihood;
  }

  public void setCustomerLikelihood(BigDecimal customerLikelihood) {
    this.customerLikelihood = customerLikelihood;
  }

  public String getCustomerCountSource() {
    return customerCountSource;
  }

  public void setCustomerCountSource(String customerCountSource) {
    this.customerCountSource = customerCountSource;
  }

  @JsonIgnore
  public ChargeType[] getChargeTypes() {
    return chargeTypes;
  }

  public void setChargeTypes(ChargeType... chargeTypes) {
    this.chargeTypes = chargeTypes;
  }

  @JsonProperty("chargeTypes")
  public String getChargeTypesAsString() {
    return EnumUtil.enumListString(chargeTypes);
  }

  public void setChargeTypesAsString(String chargeTypesStr) {
    this.chargeTypes = EnumUtil.parseEnumList(chargeTypesStr, ChargeType.class);
  }

  public String getChargePeriod() {
    return chargePeriod;
  }

  public void setChargePeriod(String chargePeriod) {
    this.chargePeriod = chargePeriod;
  }

  public Boolean getHasTimeOfUseRates() {
    return hasTimeOfUseRates;
  }

  public void setHasTimeOfUseRates(Boolean hasTimeOfUseRates) {
    this.hasTimeOfUseRates = hasTimeOfUseRates;
  }

  public Boolean getHasTieredRates() {
    return hasTieredRates;
  }

  public void setHasTieredRates(Boolean hasTieredRates) {
    this.hasTieredRates = hasTieredRates;
  }

  public Boolean getHasContractedRates() {
    return hasContractedRates;
  }

  public void setHasContractedRates(Boolean hasContractedRates) {
    this.hasContractedRates = hasContractedRates;
  }

  public Boolean getHasTariffApplicability() {
    return hasTariffApplicability;
  }

  public void setHasTariffApplicability(Boolean hasTariffApplicability) {
    this.hasTariffApplicability = hasTariffApplicability;
  }

  public Boolean getHasRateApplicability() {
    return hasRateApplicability;
  }

  public void setHasRateApplicability(Boolean hasRateApplicability) {
    this.hasRateApplicability = hasRateApplicability;
  }

  public List<TariffProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<TariffProperty> properties) {
    this.properties = properties;
  }

  public List<TariffRate> getRates() {
    return rates;
  }

  public void setRates(List<TariffRate> rates) {
    this.rates = rates;
  }
	
  public String getPrivacy() {
    return privacy;
  }
  
  public void setPrivacy(String privacy) {
    this.privacy = privacy;
  }
  
}
