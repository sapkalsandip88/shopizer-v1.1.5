/*
 * Licensed to csti consulting 
 * You may obtain a copy of the License at
 *
 * http://www.csticonsulting.com
 * Copyright (c) 2006-Aug 24, 2010 Consultation CS-TI inc. 
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.salesmanager.core.entity.reference;

import java.util.Locale;

import com.salesmanager.core.entity.common.I18NEntity;
import com.salesmanager.core.util.LabelUtil;

// Generated Nov 4, 2008 10:19:50 PM by Hibernate Tools 3.2.0.beta8

/**
 * CoreModuleServices generated by hbm2java
 */
public class CoreModuleService implements java.io.Serializable, I18NEntity {

	// Fields

	private int coreModuleServiceId;

	private int coreModuleServiceCode;

	private String coreModuleName;

	private String countryIsoCode2;

	private int coreModuleServiceSubtype;

	private String coreModuleServiceDescription;

	private String coreModuleServiceLogoPath;

	private byte coreModuleServicePosition;

	private boolean coreModuleServiceVisible;

	private boolean coreModuleServiceNew;

	private String coreModuleServiceUrl;

	private String coreModuleServiceDevProtocol;

	private String coreModuleServiceDevDomain;

	private String coreModuleServiceDevPort;

	private String coreModuleServiceDevEnv;

	private String coreModuleServiceProdProtocol;

	private String coreModuleServiceProdDomain;

	private String coreModuleServiceProdPort;

	private String coreModuleServiceProdEnv;

	private boolean coreModuleServiceConfigurable;

	public boolean isCoreModuleServiceConfigurable() {
		return coreModuleServiceConfigurable;
	}

	public void setCoreModuleServiceConfigurable(
			boolean coreModuleServiceConfigurable) {
		this.coreModuleServiceConfigurable = coreModuleServiceConfigurable;
	}

	private Locale locale;

	// Constructors

	/** default constructor */
	public CoreModuleService() {
	}

	/** minimal constructor */
	public CoreModuleService(int coreModuleServiceId,
			int coreModuleServiceCode, String coreModuleName,
			String countryIsoCode2, int coreModuleServiceSubtype,
			byte coreModuleServicePosition, boolean coreModuleServiceVisible,
			boolean coreModuleServiceNew) {
		this.coreModuleServiceId = coreModuleServiceId;
		this.coreModuleServiceCode = coreModuleServiceCode;
		this.coreModuleName = coreModuleName;
		this.countryIsoCode2 = countryIsoCode2;
		this.coreModuleServiceSubtype = coreModuleServiceSubtype;
		this.coreModuleServicePosition = coreModuleServicePosition;
		this.coreModuleServiceVisible = coreModuleServiceVisible;
		this.coreModuleServiceNew = coreModuleServiceNew;
	}

	/** full constructor */
	public CoreModuleService(int coreModuleServiceId,
			int coreModuleServiceCode, String coreModuleName,
			String countryIsoCode2, int coreModuleServiceSubtype,
			String coreModuleServiceDescription,
			String coreModuleServiceLogoPath, byte coreModuleServicePosition,
			boolean coreModuleServiceVisible, boolean coreModuleServiceNew,
			String coreModuleServiceUrl, String coreModuleServiceDevProtocol,
			String coreModuleServiceDevDomain, String coreModuleServiceDevPort,
			String coreModuleServiceDevEnv,
			String coreModuleServiceProdProtocol,
			String coreModuleServiceProdDomain,
			String coreModuleServiceProdPort, String coreModuleServiceProdEnv) {
		this.coreModuleServiceId = coreModuleServiceId;
		this.coreModuleServiceCode = coreModuleServiceCode;
		this.coreModuleName = coreModuleName;
		this.countryIsoCode2 = countryIsoCode2;
		this.coreModuleServiceSubtype = coreModuleServiceSubtype;
		this.coreModuleServiceDescription = coreModuleServiceDescription;
		this.coreModuleServiceLogoPath = coreModuleServiceLogoPath;
		this.coreModuleServicePosition = coreModuleServicePosition;
		this.coreModuleServiceVisible = coreModuleServiceVisible;
		this.coreModuleServiceNew = coreModuleServiceNew;
		this.coreModuleServiceUrl = coreModuleServiceUrl;
		this.coreModuleServiceDevProtocol = coreModuleServiceDevProtocol;
		this.coreModuleServiceDevDomain = coreModuleServiceDevDomain;
		this.coreModuleServiceDevPort = coreModuleServiceDevPort;
		this.coreModuleServiceDevEnv = coreModuleServiceDevEnv;
		this.coreModuleServiceProdProtocol = coreModuleServiceProdProtocol;
		this.coreModuleServiceProdDomain = coreModuleServiceProdDomain;
		this.coreModuleServiceProdPort = coreModuleServiceProdPort;
		this.coreModuleServiceProdEnv = coreModuleServiceProdEnv;
	}

	// Property accessors
	public int getCoreModuleServiceId() {
		return this.coreModuleServiceId;
	}

	public void setCoreModuleServiceId(int coreModuleServiceId) {
		this.coreModuleServiceId = coreModuleServiceId;
	}

	public int getCoreModuleServiceCode() {
		return this.coreModuleServiceCode;
	}

	public void setCoreModuleServiceCode(int coreModuleServiceCode) {
		this.coreModuleServiceCode = coreModuleServiceCode;
	}

	public String getCoreModuleName() {
		return this.coreModuleName;
	}

	public void setCoreModuleName(String coreModuleName) {
		this.coreModuleName = coreModuleName;
	}

	public String getCountryIsoCode2() {
		return this.countryIsoCode2;
	}

	public void setCountryIsoCode2(String countryIsoCode2) {
		this.countryIsoCode2 = countryIsoCode2;
	}

	public int getCoreModuleServiceSubtype() {
		return this.coreModuleServiceSubtype;
	}

	public void setCoreModuleServiceSubtype(int coreModuleServiceSubtype) {
		this.coreModuleServiceSubtype = coreModuleServiceSubtype;
	}

	public String getCoreModuleServiceDescription() {
		return this.coreModuleServiceDescription;
	}

	public void setCoreModuleServiceDescription(
			String coreModuleServiceDescription) {
		this.coreModuleServiceDescription = coreModuleServiceDescription;
	}

	public String getCoreModuleServiceLogoPath() {
		return this.coreModuleServiceLogoPath;
	}

	public void setCoreModuleServiceLogoPath(String coreModuleServiceLogoPath) {
		this.coreModuleServiceLogoPath = coreModuleServiceLogoPath;
	}

	public byte getCoreModuleServicePosition() {
		return this.coreModuleServicePosition;
	}

	public void setCoreModuleServicePosition(byte coreModuleServicePosition) {
		this.coreModuleServicePosition = coreModuleServicePosition;
	}

	public boolean isCoreModuleServiceVisible() {
		return this.coreModuleServiceVisible;
	}

	public void setCoreModuleServiceVisible(boolean coreModuleServiceVisible) {
		this.coreModuleServiceVisible = coreModuleServiceVisible;
	}

	public boolean isCoreModuleServiceNew() {
		return this.coreModuleServiceNew;
	}

	public void setCoreModuleServiceNew(boolean coreModuleServiceNew) {
		this.coreModuleServiceNew = coreModuleServiceNew;
	}

	public String getCoreModuleServiceUrl() {
		return this.coreModuleServiceUrl;
	}

	public void setCoreModuleServiceUrl(String coreModuleServiceUrl) {
		this.coreModuleServiceUrl = coreModuleServiceUrl;
	}

	public String getCoreModuleServiceDevProtocol() {
		return this.coreModuleServiceDevProtocol;
	}

	public void setCoreModuleServiceDevProtocol(
			String coreModuleServiceDevProtocol) {
		this.coreModuleServiceDevProtocol = coreModuleServiceDevProtocol;
	}

	public String getCoreModuleServiceDevDomain() {
		return this.coreModuleServiceDevDomain;
	}

	public void setCoreModuleServiceDevDomain(String coreModuleServiceDevDomain) {
		this.coreModuleServiceDevDomain = coreModuleServiceDevDomain;
	}

	public String getCoreModuleServiceDevPort() {
		return this.coreModuleServiceDevPort;
	}

	public void setCoreModuleServiceDevPort(String coreModuleServiceDevPort) {
		this.coreModuleServiceDevPort = coreModuleServiceDevPort;
	}

	public String getCoreModuleServiceDevEnv() {
		return this.coreModuleServiceDevEnv;
	}

	public void setCoreModuleServiceDevEnv(String coreModuleServiceDevEnv) {
		this.coreModuleServiceDevEnv = coreModuleServiceDevEnv;
	}

	public String getCoreModuleServiceProdProtocol() {
		return this.coreModuleServiceProdProtocol;
	}

	public void setCoreModuleServiceProdProtocol(
			String coreModuleServiceProdProtocol) {
		this.coreModuleServiceProdProtocol = coreModuleServiceProdProtocol;
	}

	public String getCoreModuleServiceProdDomain() {
		return this.coreModuleServiceProdDomain;
	}

	public void setCoreModuleServiceProdDomain(
			String coreModuleServiceProdDomain) {
		this.coreModuleServiceProdDomain = coreModuleServiceProdDomain;
	}

	public String getCoreModuleServiceProdPort() {
		return this.coreModuleServiceProdPort;
	}

	public void setCoreModuleServiceProdPort(String coreModuleServiceProdPort) {
		this.coreModuleServiceProdPort = coreModuleServiceProdPort;
	}

	public String getCoreModuleServiceProdEnv() {
		return this.coreModuleServiceProdEnv;
	}

	public void setCoreModuleServiceProdEnv(String coreModuleServiceProdEnv) {
		this.coreModuleServiceProdEnv = coreModuleServiceProdEnv;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public String getDescription() {
		String desc = "";
		if (this.getLocale() != null) {
			LabelUtil label =LabelUtil.getInstance();
			label.setLocale(this.getLocale());
			desc = label.getText(
					"module.description." + this.getCoreModuleName());
		} else {
			desc = this.getCoreModuleName();
		}
		return desc;
	}

	public void setLocale(Locale locale, String currency) {
		this.locale = locale;

	}

}
