package com.example.generator.base.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import lombok.Data;
import com.baomidou.mybatisplus.extension.activerecord.Model;

/**
 * <p>
 * 企业信息表
 * </p>
 *
 * @author wyc
 * @since 2022-07-28
 */
@Data
@TableName("tbase_company")

public class TbaseCompany extends Model<TbaseCompany> {

    private static final long serialVersionUID = 1L;

    /**
     * 企业ID
     */
    @TableId(value = "company_id", type = IdType.AUTO)
    private Long companyId;

    /**
     * 企业全称（工商执照上的名称）
     */
    private String companyName;

    /**
     * 内部编码 
     */
    private String companyCode;

    /**
     * 企业类型 
     */
    private String companyType;

    /**
     * 外部编码
     */
    private String companyExtcode;

    /**
     * 上级企业ID 
     */
    private Long companyParentid;

    /**
     * 层次记录
     */
    private String companyLayrec;

    /**
     * 层次级别 
     */
    private Integer companyLayno;

    /**
     * 省
     */
    private String companyProvince;

    /**
     * 市
     */
    private String companyCity;

    /**
     * 区
     */
    private String addressArea;

    /**
     * 企业地址
     */
    private String companyAddress;

    /**
     * 邮政编码
     */
    private String companyPostzip;

    /**
     * 企业电子信箱地址
     */
    private String companyEmail;

    /**
     * 联系人
     */
    private String companyLinker;

    /**
     * 联系电话
     */
    private String companyLinktel;

    /**
     * 企业电话号码
     */
    private String companyTel;

    /**
     * 企业传真
     */
    private String companyFax;

    /**
     * 记录状态 
     */
    private Long companyState;

    /**
     * 网点到目前为止总共收款的金额
     */
    private BigDecimal companyPaid;

    /**
     * 网点当前应收款的金额
     */
    private BigDecimal companySum;

    /**
     * 网点到目前为止总共应收的金额
     */
    private BigDecimal companyOwn;

    /**
     * 是否签约网点
     */
    private String companyIscontract;

    /**
     * 签约开始时间
     */
    private LocalDateTime companyBegincontractdate;

    /**
     * 签约结束时间
     */
    private LocalDateTime companyEndcontractdate;

    /**
     * 企业信用额
     */
    private BigDecimal companyOriginalcredit;

    /**
     * 企业当前信用额 每次结算时都需要重新计算企业信用额。若原始信用额为空值则无须计算，也填空值，表示无限信用。首次计算时企业当前信用额=企业初始信用额。
     */
    private BigDecimal companyCredit;

    /**
     * 单价
     */
    private BigDecimal companyPrice;

    /**
     * 备注
     */
    private String companyMemo;

    /**
     * 建档时间
     */
    private LocalDate companyAdddate;

    /**
     * 字符备用字段（上级网点名称）
     */
    private String companyVarparama;

    /**
     * 字符备用字段(登录的账号名)
     */
    private String companyVarparamb;

    /**
     * 字符备用字段
     */
    private String companyVarparamc;

    /**
     * 字符备用字段
     */
    private String companyVarparamd;

    /**
     * 字符备用字段
     */
    private String companyVarparame;

    /**
     * 数字备用字段
     */
    private Long companyIntparama;

    /**
     * 数字备用字段
     */
    private Long companyIntparamb;

    /**
     * 数字备用字段
     */
    private Long companyIntparamc;

    /**
     * 数字备用字段
     */
    private Long companyIntparamd;

    /**
     * 数字备用字段
     */
    private Long companyIntparame;

    /**
     * 浮点备用字段
     */
    private Float companyFloatparama;

    /**
     * 浮点备用字段
     */
    private Float companyFloatparamb;

    /**
     * 浮点备用字段
     */
    private Float companyFloatparamc;

    /**
     * 浮点备用字段
     */
    private Float companyFloatparamd;

    /**
     * 浮点备用字段
     */
    private Float companyFloatparame;

    /**
     * 企业电话号码2
     */
    @TableField("company_tel_2")
    private String companyTel2;

    /**
     * 企业电话号码3
     */
    @TableField("company_tel_3")
    private String companyTel3;

    private String companyVarparamf;

    private String companyVarparamg;

    private String companyVarparamh;

    private String companyVarparamj;

    private BigDecimal companyOriginalown;

    private BigDecimal companyInprice;

    private Long companySiteid;

    private String companySendercode;

    private String companyHistoryname;

    private String companyInternalName;

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
    public String getCompanyCode() {
        return companyCode;
    }

    public void setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
    }
    public String getCompanyType() {
        return companyType;
    }

    public void setCompanyType(String companyType) {
        this.companyType = companyType;
    }
    public String getCompanyExtcode() {
        return companyExtcode;
    }

    public void setCompanyExtcode(String companyExtcode) {
        this.companyExtcode = companyExtcode;
    }
    public Long getCompanyParentid() {
        return companyParentid;
    }

    public void setCompanyParentid(Long companyParentid) {
        this.companyParentid = companyParentid;
    }
    public String getCompanyLayrec() {
        return companyLayrec;
    }

    public void setCompanyLayrec(String companyLayrec) {
        this.companyLayrec = companyLayrec;
    }
    public Integer getCompanyLayno() {
        return companyLayno;
    }

    public void setCompanyLayno(Integer companyLayno) {
        this.companyLayno = companyLayno;
    }
    public String getCompanyProvince() {
        return companyProvince;
    }

    public void setCompanyProvince(String companyProvince) {
        this.companyProvince = companyProvince;
    }
    public String getCompanyCity() {
        return companyCity;
    }

    public void setCompanyCity(String companyCity) {
        this.companyCity = companyCity;
    }
    public String getAddressArea() {
        return addressArea;
    }

    public void setAddressArea(String addressArea) {
        this.addressArea = addressArea;
    }
    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }
    public String getCompanyPostzip() {
        return companyPostzip;
    }

    public void setCompanyPostzip(String companyPostzip) {
        this.companyPostzip = companyPostzip;
    }
    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }
    public String getCompanyLinker() {
        return companyLinker;
    }

    public void setCompanyLinker(String companyLinker) {
        this.companyLinker = companyLinker;
    }
    public String getCompanyLinktel() {
        return companyLinktel;
    }

    public void setCompanyLinktel(String companyLinktel) {
        this.companyLinktel = companyLinktel;
    }
    public String getCompanyTel() {
        return companyTel;
    }

    public void setCompanyTel(String companyTel) {
        this.companyTel = companyTel;
    }
    public String getCompanyFax() {
        return companyFax;
    }

    public void setCompanyFax(String companyFax) {
        this.companyFax = companyFax;
    }
    public Long getCompanyState() {
        return companyState;
    }

    public void setCompanyState(Long companyState) {
        this.companyState = companyState;
    }
    public BigDecimal getCompanyPaid() {
        return companyPaid;
    }

    public void setCompanyPaid(BigDecimal companyPaid) {
        this.companyPaid = companyPaid;
    }
    public BigDecimal getCompanySum() {
        return companySum;
    }

    public void setCompanySum(BigDecimal companySum) {
        this.companySum = companySum;
    }
    public BigDecimal getCompanyOwn() {
        return companyOwn;
    }

    public void setCompanyOwn(BigDecimal companyOwn) {
        this.companyOwn = companyOwn;
    }
    public String getCompanyIscontract() {
        return companyIscontract;
    }

    public void setCompanyIscontract(String companyIscontract) {
        this.companyIscontract = companyIscontract;
    }
    public LocalDateTime getCompanyBegincontractdate() {
        return companyBegincontractdate;
    }

    public void setCompanyBegincontractdate(LocalDateTime companyBegincontractdate) {
        this.companyBegincontractdate = companyBegincontractdate;
    }
    public LocalDateTime getCompanyEndcontractdate() {
        return companyEndcontractdate;
    }

    public void setCompanyEndcontractdate(LocalDateTime companyEndcontractdate) {
        this.companyEndcontractdate = companyEndcontractdate;
    }
    public BigDecimal getCompanyOriginalcredit() {
        return companyOriginalcredit;
    }

    public void setCompanyOriginalcredit(BigDecimal companyOriginalcredit) {
        this.companyOriginalcredit = companyOriginalcredit;
    }
    public BigDecimal getCompanyCredit() {
        return companyCredit;
    }

    public void setCompanyCredit(BigDecimal companyCredit) {
        this.companyCredit = companyCredit;
    }
    public BigDecimal getCompanyPrice() {
        return companyPrice;
    }

    public void setCompanyPrice(BigDecimal companyPrice) {
        this.companyPrice = companyPrice;
    }
    public String getCompanyMemo() {
        return companyMemo;
    }

    public void setCompanyMemo(String companyMemo) {
        this.companyMemo = companyMemo;
    }
    public LocalDate getCompanyAdddate() {
        return companyAdddate;
    }

    public void setCompanyAdddate(LocalDate companyAdddate) {
        this.companyAdddate = companyAdddate;
    }
    public String getCompanyVarparama() {
        return companyVarparama;
    }

    public void setCompanyVarparama(String companyVarparama) {
        this.companyVarparama = companyVarparama;
    }
    public String getCompanyVarparamb() {
        return companyVarparamb;
    }

    public void setCompanyVarparamb(String companyVarparamb) {
        this.companyVarparamb = companyVarparamb;
    }
    public String getCompanyVarparamc() {
        return companyVarparamc;
    }

    public void setCompanyVarparamc(String companyVarparamc) {
        this.companyVarparamc = companyVarparamc;
    }
    public String getCompanyVarparamd() {
        return companyVarparamd;
    }

    public void setCompanyVarparamd(String companyVarparamd) {
        this.companyVarparamd = companyVarparamd;
    }
    public String getCompanyVarparame() {
        return companyVarparame;
    }

    public void setCompanyVarparame(String companyVarparame) {
        this.companyVarparame = companyVarparame;
    }
    public Long getCompanyIntparama() {
        return companyIntparama;
    }

    public void setCompanyIntparama(Long companyIntparama) {
        this.companyIntparama = companyIntparama;
    }
    public Long getCompanyIntparamb() {
        return companyIntparamb;
    }

    public void setCompanyIntparamb(Long companyIntparamb) {
        this.companyIntparamb = companyIntparamb;
    }
    public Long getCompanyIntparamc() {
        return companyIntparamc;
    }

    public void setCompanyIntparamc(Long companyIntparamc) {
        this.companyIntparamc = companyIntparamc;
    }
    public Long getCompanyIntparamd() {
        return companyIntparamd;
    }

    public void setCompanyIntparamd(Long companyIntparamd) {
        this.companyIntparamd = companyIntparamd;
    }
    public Long getCompanyIntparame() {
        return companyIntparame;
    }

    public void setCompanyIntparame(Long companyIntparame) {
        this.companyIntparame = companyIntparame;
    }
    public Float getCompanyFloatparama() {
        return companyFloatparama;
    }

    public void setCompanyFloatparama(Float companyFloatparama) {
        this.companyFloatparama = companyFloatparama;
    }
    public Float getCompanyFloatparamb() {
        return companyFloatparamb;
    }

    public void setCompanyFloatparamb(Float companyFloatparamb) {
        this.companyFloatparamb = companyFloatparamb;
    }
    public Float getCompanyFloatparamc() {
        return companyFloatparamc;
    }

    public void setCompanyFloatparamc(Float companyFloatparamc) {
        this.companyFloatparamc = companyFloatparamc;
    }
    public Float getCompanyFloatparamd() {
        return companyFloatparamd;
    }

    public void setCompanyFloatparamd(Float companyFloatparamd) {
        this.companyFloatparamd = companyFloatparamd;
    }
    public Float getCompanyFloatparame() {
        return companyFloatparame;
    }

    public void setCompanyFloatparame(Float companyFloatparame) {
        this.companyFloatparame = companyFloatparame;
    }
    public String getCompanyTel2() {
        return companyTel2;
    }

    public void setCompanyTel2(String companyTel2) {
        this.companyTel2 = companyTel2;
    }
    public String getCompanyTel3() {
        return companyTel3;
    }

    public void setCompanyTel3(String companyTel3) {
        this.companyTel3 = companyTel3;
    }
    public String getCompanyVarparamf() {
        return companyVarparamf;
    }

    public void setCompanyVarparamf(String companyVarparamf) {
        this.companyVarparamf = companyVarparamf;
    }
    public String getCompanyVarparamg() {
        return companyVarparamg;
    }

    public void setCompanyVarparamg(String companyVarparamg) {
        this.companyVarparamg = companyVarparamg;
    }
    public String getCompanyVarparamh() {
        return companyVarparamh;
    }

    public void setCompanyVarparamh(String companyVarparamh) {
        this.companyVarparamh = companyVarparamh;
    }
    public String getCompanyVarparamj() {
        return companyVarparamj;
    }

    public void setCompanyVarparamj(String companyVarparamj) {
        this.companyVarparamj = companyVarparamj;
    }
    public BigDecimal getCompanyOriginalown() {
        return companyOriginalown;
    }

    public void setCompanyOriginalown(BigDecimal companyOriginalown) {
        this.companyOriginalown = companyOriginalown;
    }
    public BigDecimal getCompanyInprice() {
        return companyInprice;
    }

    public void setCompanyInprice(BigDecimal companyInprice) {
        this.companyInprice = companyInprice;
    }
    public Long getCompanySiteid() {
        return companySiteid;
    }

    public void setCompanySiteid(Long companySiteid) {
        this.companySiteid = companySiteid;
    }
    public String getCompanySendercode() {
        return companySendercode;
    }

    public void setCompanySendercode(String companySendercode) {
        this.companySendercode = companySendercode;
    }
    public String getCompanyHistoryname() {
        return companyHistoryname;
    }

    public void setCompanyHistoryname(String companyHistoryname) {
        this.companyHistoryname = companyHistoryname;
    }
    public String getCompanyInternalName() {
        return companyInternalName;
    }

    public void setCompanyInternalName(String companyInternalName) {
        this.companyInternalName = companyInternalName;
    }

    @Override
    public String toString() {
        return "TbaseCompany{" +
            "companyId=" + companyId +
            ", companyName=" + companyName +
            ", companyCode=" + companyCode +
            ", companyType=" + companyType +
            ", companyExtcode=" + companyExtcode +
            ", companyParentid=" + companyParentid +
            ", companyLayrec=" + companyLayrec +
            ", companyLayno=" + companyLayno +
            ", companyProvince=" + companyProvince +
            ", companyCity=" + companyCity +
            ", addressArea=" + addressArea +
            ", companyAddress=" + companyAddress +
            ", companyPostzip=" + companyPostzip +
            ", companyEmail=" + companyEmail +
            ", companyLinker=" + companyLinker +
            ", companyLinktel=" + companyLinktel +
            ", companyTel=" + companyTel +
            ", companyFax=" + companyFax +
            ", companyState=" + companyState +
            ", companyPaid=" + companyPaid +
            ", companySum=" + companySum +
            ", companyOwn=" + companyOwn +
            ", companyIscontract=" + companyIscontract +
            ", companyBegincontractdate=" + companyBegincontractdate +
            ", companyEndcontractdate=" + companyEndcontractdate +
            ", companyOriginalcredit=" + companyOriginalcredit +
            ", companyCredit=" + companyCredit +
            ", companyPrice=" + companyPrice +
            ", companyMemo=" + companyMemo +
            ", companyAdddate=" + companyAdddate +
            ", companyVarparama=" + companyVarparama +
            ", companyVarparamb=" + companyVarparamb +
            ", companyVarparamc=" + companyVarparamc +
            ", companyVarparamd=" + companyVarparamd +
            ", companyVarparame=" + companyVarparame +
            ", companyIntparama=" + companyIntparama +
            ", companyIntparamb=" + companyIntparamb +
            ", companyIntparamc=" + companyIntparamc +
            ", companyIntparamd=" + companyIntparamd +
            ", companyIntparame=" + companyIntparame +
            ", companyFloatparama=" + companyFloatparama +
            ", companyFloatparamb=" + companyFloatparamb +
            ", companyFloatparamc=" + companyFloatparamc +
            ", companyFloatparamd=" + companyFloatparamd +
            ", companyFloatparame=" + companyFloatparame +
            ", companyTel2=" + companyTel2 +
            ", companyTel3=" + companyTel3 +
            ", companyVarparamf=" + companyVarparamf +
            ", companyVarparamg=" + companyVarparamg +
            ", companyVarparamh=" + companyVarparamh +
            ", companyVarparamj=" + companyVarparamj +
            ", companyOriginalown=" + companyOriginalown +
            ", companyInprice=" + companyInprice +
            ", companySiteid=" + companySiteid +
            ", companySendercode=" + companySendercode +
            ", companyHistoryname=" + companyHistoryname +
            ", companyInternalName=" + companyInternalName +
        "}";
    }
}
