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
package com.salesmanager.core.entity.orders;

// Generated Dec 29, 2008 11:38:30 AM by Hibernate Tools 3.2.0.beta8

import java.math.BigDecimal;

import com.salesmanager.core.entity.catalog.ProductPriceSpecial;

/**
 * OrdersProductsPrices generated by hbm2java
 */
public class OrderProductPrice implements java.io.Serializable {

	// Fields

	private long orderProductPrice;

	private long orderId;

	private long orderProductId;

	private int productPriceTypeId;

	private String productPriceModuleName;

	private BigDecimal productPriceAmount;

	private boolean defaultPrice;

	private boolean productHasTax;

	private String productPriceName;

	// transient
	private ProductPriceSpecial special;

	// Constructors

	/** default constructor */
	public OrderProductPrice() {
	}

	/** full constructor */
	public OrderProductPrice(long orderProductPrice, long orderId,
			long orderProductId, int productPriceTypeId,
			String productPriceModuleName, BigDecimal productPriceAmount,
			boolean defaultPrice, boolean productHasTax, String productPriceName) {
		this.orderProductPrice = orderProductPrice;
		this.orderId = orderId;
		this.orderProductId = orderProductId;
		this.productPriceTypeId = productPriceTypeId;
		this.productPriceModuleName = productPriceModuleName;
		this.productPriceAmount = productPriceAmount;
		this.defaultPrice = defaultPrice;
		this.productHasTax = productHasTax;
		this.productPriceName = productPriceName;
	}

	// Property accessors
	public long getOrderProductPrice() {
		return this.orderProductPrice;
	}

	public void setOrderProductPrice(long orderProductPrice) {
		this.orderProductPrice = orderProductPrice;
	}

	public long getOrderId() {
		return this.orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public long getOrderProductId() {
		return this.orderProductId;
	}

	public void setOrderProductId(long orderProductId) {
		this.orderProductId = orderProductId;
	}

	public int getProductPriceTypeId() {
		return this.productPriceTypeId;
	}

	public void setProductPriceTypeId(int productPriceTypeId) {
		this.productPriceTypeId = productPriceTypeId;
	}

	public String getProductPriceModuleName() {
		return this.productPriceModuleName;
	}

	public void setProductPriceModuleName(String productPriceModuleName) {
		this.productPriceModuleName = productPriceModuleName;
	}

	public BigDecimal getProductPriceAmount() {
		return this.productPriceAmount;
	}

	public void setProductPriceAmount(BigDecimal productPriceAmount) {
		this.productPriceAmount = productPriceAmount;
	}

	public boolean isDefaultPrice() {
		return this.defaultPrice;
	}

	public void setDefaultPrice(boolean defaultPrice) {
		this.defaultPrice = defaultPrice;
	}

	public boolean isProductHasTax() {
		return productHasTax;
	}

	public void setProductHasTax(boolean productHasTax) {
		this.productHasTax = productHasTax;
	}

	public ProductPriceSpecial getSpecial() {
		return special;
	}

	public void setSpecial(ProductPriceSpecial special) {
		this.special = special;
	}

	public String getProductPriceName() {
		return productPriceName;
	}

	public void setProductPriceName(String productPriceName) {
		this.productPriceName = productPriceName;
	}

}
