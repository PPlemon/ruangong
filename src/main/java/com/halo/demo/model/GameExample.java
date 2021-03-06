package com.halo.demo.model;

import java.util.ArrayList;
import java.util.List;

public class GameExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public GameExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
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

        public Criteria andGnoIsNull() {
            addCriterion("gno is null");
            return (Criteria) this;
        }

        public Criteria andGnoIsNotNull() {
            addCriterion("gno is not null");
            return (Criteria) this;
        }

        public Criteria andGnoEqualTo(Integer value) {
            addCriterion("gno =", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoNotEqualTo(Integer value) {
            addCriterion("gno <>", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoGreaterThan(Integer value) {
            addCriterion("gno >", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoGreaterThanOrEqualTo(Integer value) {
            addCriterion("gno >=", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoLessThan(Integer value) {
            addCriterion("gno <", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoLessThanOrEqualTo(Integer value) {
            addCriterion("gno <=", value, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoIn(List<Integer> values) {
            addCriterion("gno in", values, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoNotIn(List<Integer> values) {
            addCriterion("gno not in", values, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoBetween(Integer value1, Integer value2) {
            addCriterion("gno between", value1, value2, "gno");
            return (Criteria) this;
        }

        public Criteria andGnoNotBetween(Integer value1, Integer value2) {
            addCriterion("gno not between", value1, value2, "gno");
            return (Criteria) this;
        }

        public Criteria andGnameIsNull() {
            addCriterion("gname is null");
            return (Criteria) this;
        }

        public Criteria andGnameIsNotNull() {
            addCriterion("gname is not null");
            return (Criteria) this;
        }

        public Criteria andGnameEqualTo(String value) {
            addCriterion("gname =", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotEqualTo(String value) {
            addCriterion("gname <>", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThan(String value) {
            addCriterion("gname >", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameGreaterThanOrEqualTo(String value) {
            addCriterion("gname >=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThan(String value) {
            addCriterion("gname <", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLessThanOrEqualTo(String value) {
            addCriterion("gname <=", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameLike(String value) {
            addCriterion("gname like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotLike(String value) {
            addCriterion("gname not like", value, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameIn(List<String> values) {
            addCriterion("gname in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotIn(List<String> values) {
            addCriterion("gname not in", values, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameBetween(String value1, String value2) {
            addCriterion("gname between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andGnameNotBetween(String value1, String value2) {
            addCriterion("gname not between", value1, value2, "gname");
            return (Criteria) this;
        }

        public Criteria andWinnerIsNull() {
            addCriterion("winner is null");
            return (Criteria) this;
        }

        public Criteria andWinnerIsNotNull() {
            addCriterion("winner is not null");
            return (Criteria) this;
        }

        public Criteria andWinnerEqualTo(Integer value) {
            addCriterion("winner =", value, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerNotEqualTo(Integer value) {
            addCriterion("winner <>", value, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerGreaterThan(Integer value) {
            addCriterion("winner >", value, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("winner >=", value, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerLessThan(Integer value) {
            addCriterion("winner <", value, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerLessThanOrEqualTo(Integer value) {
            addCriterion("winner <=", value, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerIn(List<Integer> values) {
            addCriterion("winner in", values, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerNotIn(List<Integer> values) {
            addCriterion("winner not in", values, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerBetween(Integer value1, Integer value2) {
            addCriterion("winner between", value1, value2, "winner");
            return (Criteria) this;
        }

        public Criteria andWinnerNotBetween(Integer value1, Integer value2) {
            addCriterion("winner not between", value1, value2, "winner");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andRankIsNull() {
            addCriterion("rank is null");
            return (Criteria) this;
        }

        public Criteria andRankIsNotNull() {
            addCriterion("rank is not null");
            return (Criteria) this;
        }

        public Criteria andRankEqualTo(String value) {
            addCriterion("rank =", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotEqualTo(String value) {
            addCriterion("rank <>", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThan(String value) {
            addCriterion("rank >", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankGreaterThanOrEqualTo(String value) {
            addCriterion("rank >=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThan(String value) {
            addCriterion("rank <", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLessThanOrEqualTo(String value) {
            addCriterion("rank <=", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankLike(String value) {
            addCriterion("rank like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotLike(String value) {
            addCriterion("rank not like", value, "rank");
            return (Criteria) this;
        }

        public Criteria andRankIn(List<String> values) {
            addCriterion("rank in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotIn(List<String> values) {
            addCriterion("rank not in", values, "rank");
            return (Criteria) this;
        }

        public Criteria andRankBetween(String value1, String value2) {
            addCriterion("rank between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRankNotBetween(String value1, String value2) {
            addCriterion("rank not between", value1, value2, "rank");
            return (Criteria) this;
        }

        public Criteria andRanknoIsNull() {
            addCriterion("rankno is null");
            return (Criteria) this;
        }

        public Criteria andRanknoIsNotNull() {
            addCriterion("rankno is not null");
            return (Criteria) this;
        }

        public Criteria andRanknoEqualTo(Integer value) {
            addCriterion("rankno =", value, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoNotEqualTo(Integer value) {
            addCriterion("rankno <>", value, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoGreaterThan(Integer value) {
            addCriterion("rankno >", value, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoGreaterThanOrEqualTo(Integer value) {
            addCriterion("rankno >=", value, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoLessThan(Integer value) {
            addCriterion("rankno <", value, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoLessThanOrEqualTo(Integer value) {
            addCriterion("rankno <=", value, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoIn(List<Integer> values) {
            addCriterion("rankno in", values, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoNotIn(List<Integer> values) {
            addCriterion("rankno not in", values, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoBetween(Integer value1, Integer value2) {
            addCriterion("rankno between", value1, value2, "rankno");
            return (Criteria) this;
        }

        public Criteria andRanknoNotBetween(Integer value1, Integer value2) {
            addCriterion("rankno not between", value1, value2, "rankno");
            return (Criteria) this;
        }

        public Criteria andGurlIsNull() {
            addCriterion("gurl is null");
            return (Criteria) this;
        }

        public Criteria andGurlIsNotNull() {
            addCriterion("gurl is not null");
            return (Criteria) this;
        }

        public Criteria andGurlEqualTo(String value) {
            addCriterion("gurl =", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlNotEqualTo(String value) {
            addCriterion("gurl <>", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlGreaterThan(String value) {
            addCriterion("gurl >", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlGreaterThanOrEqualTo(String value) {
            addCriterion("gurl >=", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlLessThan(String value) {
            addCriterion("gurl <", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlLessThanOrEqualTo(String value) {
            addCriterion("gurl <=", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlLike(String value) {
            addCriterion("gurl like", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlNotLike(String value) {
            addCriterion("gurl not like", value, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlIn(List<String> values) {
            addCriterion("gurl in", values, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlNotIn(List<String> values) {
            addCriterion("gurl not in", values, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlBetween(String value1, String value2) {
            addCriterion("gurl between", value1, value2, "gurl");
            return (Criteria) this;
        }

        public Criteria andGurlNotBetween(String value1, String value2) {
            addCriterion("gurl not between", value1, value2, "gurl");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedIsNull() {
            addCriterion("isconfirmed is null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedIsNotNull() {
            addCriterion("isconfirmed is not null");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedEqualTo(Boolean value) {
            addCriterion("isconfirmed =", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedNotEqualTo(Boolean value) {
            addCriterion("isconfirmed <>", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedGreaterThan(Boolean value) {
            addCriterion("isconfirmed >", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isconfirmed >=", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedLessThan(Boolean value) {
            addCriterion("isconfirmed <", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedLessThanOrEqualTo(Boolean value) {
            addCriterion("isconfirmed <=", value, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedIn(List<Boolean> values) {
            addCriterion("isconfirmed in", values, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedNotIn(List<Boolean> values) {
            addCriterion("isconfirmed not in", values, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedBetween(Boolean value1, Boolean value2) {
            addCriterion("isconfirmed between", value1, value2, "isconfirmed");
            return (Criteria) this;
        }

        public Criteria andIsconfirmedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isconfirmed not between", value1, value2, "isconfirmed");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table game
     *
     * @mbg.generated do_not_delete_during_merge Tue Dec 10 16:22:30 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table game
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
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