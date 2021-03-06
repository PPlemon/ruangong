package com.halo.demo.model;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.bno
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private Integer bno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.bname
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private String bname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.author
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private Integer author;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.type
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.pubdate
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private Long pubdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.rank
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private String rank;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.rankno
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private Integer rankno;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.burl
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private String burl;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book.isconfirmed
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    private Boolean isconfirmed;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.bno
     *
     * @return the value of book.bno
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public Integer getBno() {
        return bno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.bno
     *
     * @param bno the value for book.bno
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setBno(Integer bno) {
        this.bno = bno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.bname
     *
     * @return the value of book.bname
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public String getBname() {
        return bname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.bname
     *
     * @param bname the value for book.bname
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.author
     *
     * @return the value of book.author
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public Integer getAuthor() {
        return author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.author
     *
     * @param author the value for book.author
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setAuthor(Integer author) {
        this.author = author;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.type
     *
     * @return the value of book.type
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public String getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.type
     *
     * @param type the value for book.type
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.pubdate
     *
     * @return the value of book.pubdate
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public Long getPubdate() {
        return pubdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.pubdate
     *
     * @param pubdate the value for book.pubdate
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setPubdate(Long pubdate) {
        this.pubdate = pubdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.rank
     *
     * @return the value of book.rank
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public String getRank() {
        return rank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.rank
     *
     * @param rank the value for book.rank
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setRank(String rank) {
        this.rank = rank == null ? null : rank.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.rankno
     *
     * @return the value of book.rankno
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public Integer getRankno() {
        return rankno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.rankno
     *
     * @param rankno the value for book.rankno
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setRankno(Integer rankno) {
        this.rankno = rankno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.burl
     *
     * @return the value of book.burl
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public String getBurl() {
        return burl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.burl
     *
     * @param burl the value for book.burl
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setBurl(String burl) {
        this.burl = burl == null ? null : burl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book.isconfirmed
     *
     * @return the value of book.isconfirmed
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public Boolean getIsconfirmed() {
        return isconfirmed;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book.isconfirmed
     *
     * @param isconfirmed the value for book.isconfirmed
     *
     * @mbg.generated Tue Dec 10 16:22:30 CST 2019
     */
    public void setIsconfirmed(Boolean isconfirmed) {
        this.isconfirmed = isconfirmed;
    }
}