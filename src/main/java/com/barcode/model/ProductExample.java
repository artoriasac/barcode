package com.barcode.model;

import java.util.ArrayList;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(String value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(String value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(String value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(String value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(String value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLike(String value) {
            addCriterion("product_type like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotLike(String value) {
            addCriterion("product_type not like", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<String> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<String> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(String value1, String value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(String value1, String value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNull() {
            addCriterion("product_code is null");
            return (Criteria) this;
        }

        public Criteria andProductCodeIsNotNull() {
            addCriterion("product_code is not null");
            return (Criteria) this;
        }

        public Criteria andProductCodeEqualTo(String value) {
            addCriterion("product_code =", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotEqualTo(String value) {
            addCriterion("product_code <>", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThan(String value) {
            addCriterion("product_code >", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeGreaterThanOrEqualTo(String value) {
            addCriterion("product_code >=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThan(String value) {
            addCriterion("product_code <", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLessThanOrEqualTo(String value) {
            addCriterion("product_code <=", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeLike(String value) {
            addCriterion("product_code like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotLike(String value) {
            addCriterion("product_code not like", value, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeIn(List<String> values) {
            addCriterion("product_code in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotIn(List<String> values) {
            addCriterion("product_code not in", values, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeBetween(String value1, String value2) {
            addCriterion("product_code between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductCodeNotBetween(String value1, String value2) {
            addCriterion("product_code not between", value1, value2, "productCode");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNull() {
            addCriterion("product_color is null");
            return (Criteria) this;
        }

        public Criteria andProductColorIsNotNull() {
            addCriterion("product_color is not null");
            return (Criteria) this;
        }

        public Criteria andProductColorEqualTo(String value) {
            addCriterion("product_color =", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotEqualTo(String value) {
            addCriterion("product_color <>", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThan(String value) {
            addCriterion("product_color >", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorGreaterThanOrEqualTo(String value) {
            addCriterion("product_color >=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThan(String value) {
            addCriterion("product_color <", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLessThanOrEqualTo(String value) {
            addCriterion("product_color <=", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorLike(String value) {
            addCriterion("product_color like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotLike(String value) {
            addCriterion("product_color not like", value, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorIn(List<String> values) {
            addCriterion("product_color in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotIn(List<String> values) {
            addCriterion("product_color not in", values, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorBetween(String value1, String value2) {
            addCriterion("product_color between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductColorNotBetween(String value1, String value2) {
            addCriterion("product_color not between", value1, value2, "productColor");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeIsNull() {
            addCriterion("product_display_size is null");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeIsNotNull() {
            addCriterion("product_display_size is not null");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeEqualTo(String value) {
            addCriterion("product_display_size =", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeNotEqualTo(String value) {
            addCriterion("product_display_size <>", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeGreaterThan(String value) {
            addCriterion("product_display_size >", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeGreaterThanOrEqualTo(String value) {
            addCriterion("product_display_size >=", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeLessThan(String value) {
            addCriterion("product_display_size <", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeLessThanOrEqualTo(String value) {
            addCriterion("product_display_size <=", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeLike(String value) {
            addCriterion("product_display_size like", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeNotLike(String value) {
            addCriterion("product_display_size not like", value, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeIn(List<String> values) {
            addCriterion("product_display_size in", values, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeNotIn(List<String> values) {
            addCriterion("product_display_size not in", values, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeBetween(String value1, String value2) {
            addCriterion("product_display_size between", value1, value2, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductDisplaySizeNotBetween(String value1, String value2) {
            addCriterion("product_display_size not between", value1, value2, "productDisplaySize");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNull() {
            addCriterion("product_info is null");
            return (Criteria) this;
        }

        public Criteria andProductInfoIsNotNull() {
            addCriterion("product_info is not null");
            return (Criteria) this;
        }

        public Criteria andProductInfoEqualTo(String value) {
            addCriterion("product_info =", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotEqualTo(String value) {
            addCriterion("product_info <>", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThan(String value) {
            addCriterion("product_info >", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoGreaterThanOrEqualTo(String value) {
            addCriterion("product_info >=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThan(String value) {
            addCriterion("product_info <", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLessThanOrEqualTo(String value) {
            addCriterion("product_info <=", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoLike(String value) {
            addCriterion("product_info like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotLike(String value) {
            addCriterion("product_info not like", value, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoIn(List<String> values) {
            addCriterion("product_info in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotIn(List<String> values) {
            addCriterion("product_info not in", values, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoBetween(String value1, String value2) {
            addCriterion("product_info between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductInfoNotBetween(String value1, String value2) {
            addCriterion("product_info not between", value1, value2, "productInfo");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNull() {
            addCriterion("product_weight is null");
            return (Criteria) this;
        }

        public Criteria andProductWeightIsNotNull() {
            addCriterion("product_weight is not null");
            return (Criteria) this;
        }

        public Criteria andProductWeightEqualTo(String value) {
            addCriterion("product_weight =", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotEqualTo(String value) {
            addCriterion("product_weight <>", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThan(String value) {
            addCriterion("product_weight >", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightGreaterThanOrEqualTo(String value) {
            addCriterion("product_weight >=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThan(String value) {
            addCriterion("product_weight <", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLessThanOrEqualTo(String value) {
            addCriterion("product_weight <=", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightLike(String value) {
            addCriterion("product_weight like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotLike(String value) {
            addCriterion("product_weight not like", value, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightIn(List<String> values) {
            addCriterion("product_weight in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotIn(List<String> values) {
            addCriterion("product_weight not in", values, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightBetween(String value1, String value2) {
            addCriterion("product_weight between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductWeightNotBetween(String value1, String value2) {
            addCriterion("product_weight not between", value1, value2, "productWeight");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeIsNull() {
            addCriterion("product_pack_size is null");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeIsNotNull() {
            addCriterion("product_pack_size is not null");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeEqualTo(String value) {
            addCriterion("product_pack_size =", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeNotEqualTo(String value) {
            addCriterion("product_pack_size <>", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeGreaterThan(String value) {
            addCriterion("product_pack_size >", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeGreaterThanOrEqualTo(String value) {
            addCriterion("product_pack_size >=", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeLessThan(String value) {
            addCriterion("product_pack_size <", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeLessThanOrEqualTo(String value) {
            addCriterion("product_pack_size <=", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeLike(String value) {
            addCriterion("product_pack_size like", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeNotLike(String value) {
            addCriterion("product_pack_size not like", value, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeIn(List<String> values) {
            addCriterion("product_pack_size in", values, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeNotIn(List<String> values) {
            addCriterion("product_pack_size not in", values, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeBetween(String value1, String value2) {
            addCriterion("product_pack_size between", value1, value2, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPackSizeNotBetween(String value1, String value2) {
            addCriterion("product_pack_size not between", value1, value2, "productPackSize");
            return (Criteria) this;
        }

        public Criteria andProductPnIsNull() {
            addCriterion("product_PN is null");
            return (Criteria) this;
        }

        public Criteria andProductPnIsNotNull() {
            addCriterion("product_PN is not null");
            return (Criteria) this;
        }

        public Criteria andProductPnEqualTo(String value) {
            addCriterion("product_PN =", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnNotEqualTo(String value) {
            addCriterion("product_PN <>", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnGreaterThan(String value) {
            addCriterion("product_PN >", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnGreaterThanOrEqualTo(String value) {
            addCriterion("product_PN >=", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnLessThan(String value) {
            addCriterion("product_PN <", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnLessThanOrEqualTo(String value) {
            addCriterion("product_PN <=", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnLike(String value) {
            addCriterion("product_PN like", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnNotLike(String value) {
            addCriterion("product_PN not like", value, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnIn(List<String> values) {
            addCriterion("product_PN in", values, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnNotIn(List<String> values) {
            addCriterion("product_PN not in", values, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnBetween(String value1, String value2) {
            addCriterion("product_PN between", value1, value2, "productPn");
            return (Criteria) this;
        }

        public Criteria andProductPnNotBetween(String value1, String value2) {
            addCriterion("product_PN not between", value1, value2, "productPn");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}