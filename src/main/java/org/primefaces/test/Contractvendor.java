/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.primefaces.test;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 * @author charlie
 */
@Entity
@Table(name = "contractvendor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contractvendor.findAll", query = "SELECT c FROM Contractvendor c"),
    @NamedQuery(name = "Contractvendor.findByLineid", query = "SELECT c FROM Contractvendor c WHERE c.lineid = :lineid"),
    @NamedQuery(name = "Contractvendor.findByContractid", query = "SELECT c FROM Contractvendor c WHERE c.contractid = :contractid"),
    @NamedQuery(name = "Contractvendor.findByVendorid", query = "SELECT c FROM Contractvendor c WHERE c.vendorid = :vendorid"),
    @NamedQuery(name = "Contractvendor.findBySubcontractdate", query = "SELECT c FROM Contractvendor c WHERE c.subcontractdate = :subcontractdate"),
    @NamedQuery(name = "Contractvendor.findBySubcontractid", query = "SELECT c FROM Contractvendor c WHERE c.subcontractid = :subcontractid"),
    @NamedQuery(name = "Contractvendor.findBySubcontractname", query = "SELECT c FROM Contractvendor c WHERE c.subcontractname = :subcontractname"),
    @NamedQuery(name = "Contractvendor.findByCcyid", query = "SELECT c FROM Contractvendor c WHERE c.ccyid = :ccyid"),
    @NamedQuery(name = "Contractvendor.findByExchangerate", query = "SELECT c FROM Contractvendor c WHERE c.exchangerate = :exchangerate"),
    @NamedQuery(name = "Contractvendor.findByContractamount", query = "SELECT c FROM Contractvendor c WHERE c.contractamount = :contractamount"),
    @NamedQuery(name = "Contractvendor.findByFccontractamount", query = "SELECT c FROM Contractvendor c WHERE c.fccontractamount = :fccontractamount"),
    @NamedQuery(name = "Contractvendor.findByIsappendix", query = "SELECT c FROM Contractvendor c WHERE c.isappendix = :isappendix"),
    @NamedQuery(name = "Contractvendor.findByExpendid", query = "SELECT c FROM Contractvendor c WHERE c.expendid = :expendid"),
    @NamedQuery(name = "Contractvendor.findBySexpendid", query = "SELECT c FROM Contractvendor c WHERE c.sexpendid = :sexpendid"),
    @NamedQuery(name = "Contractvendor.findByCapitalclass", query = "SELECT c FROM Contractvendor c WHERE c.capitalclass = :capitalclass"),
    @NamedQuery(name = "Contractvendor.findByProjectid", query = "SELECT c FROM Contractvendor c WHERE c.projectid = :projectid")})
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Contractvendor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 20)
    @Column(name = "lineid")
    private String lineid = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 20)
    @Column(name = "contractid")
    private String contractid = "";
    @Basic(optional = false)
    @NotNull(message = "Bạn chưa chọn nhà cung cấp")
    @Size(min = 0, max = 15)
    @Column(name = "vendorid")
    private String vendorid = "";
    @Basic(optional = false)
    @NotNull
    @Column(name = "subcontractdate")
    private LocalDate subcontractdate = LocalDate.now();
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 20)
    @Column(name = "subcontractid")
    private String subcontractid = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 200)
    @Column(name = "subcontractname")
    private String subcontractname = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 3)
    @Column(name = "ccyid")
    private String ccyid = "VND";
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Column(name = "exchangerate")
    private BigDecimal exchangerate = BigDecimal.ONE;
    @Basic(optional = false)
    @NotNull
    @Column(name = "contractamount")
    private BigDecimal contractamount = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fccontractamount")
    private BigDecimal fccontractamount = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "isappendix")
    private boolean isappendix;
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 15)
    @Column(name = "expendid")
    private String expendid = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 15)
    @Column(name = "sexpendid")
    private String sexpendid = "";
    @Basic(optional = false)
    @NotNull
    @Column(name = "capitalclass")
    private short capitalclass;
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 15)
    @Column(name = "projectid")
    private String projectid = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 15)
    @Column(name = "capitalid")
    private String capitalid = "";
    @Basic(optional = false)
    @NotNull
    @Column(name = "fcadvamount")
    private BigDecimal fcadvamount = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Column(name = "advamount")
    private BigDecimal advamount = BigDecimal.ZERO;
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 50)
    @Column(name = "hdk")
    private String hdk = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 50)
    @Column(name = "hdth")
    private String hdth = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 50)
    @Column(name = "bankaccount")
    private String bankaccount = "";
    @Basic(optional = false)
    @NotNull
    @Size(min = 0, max = 254)
    @Column(name = "bankname")
    private String bankname = "";

    public Contractvendor(String lineid) {
        this.lineid = lineid;
    }

    public Contractvendor(Contractvendor other) {
        this.lineid = other.lineid;
        this.contractid = other.contractid;
        this.vendorid = other.vendorid;
        this.subcontractdate = other.subcontractdate;
        this.subcontractid = other.subcontractid;
        this.subcontractname = other.subcontractname;
        this.ccyid = other.ccyid;
        this.exchangerate = other.exchangerate;
        this.contractamount = other.contractamount;
        this.fccontractamount = other.fccontractamount;
        this.isappendix = other.isappendix;
        this.expendid = other.expendid;
        this.sexpendid = other.sexpendid;
        this.capitalclass = other.capitalclass;
        this.projectid = other.projectid;
        this.capitalid = other.capitalid;
        this.fcadvamount = other.fcadvamount;
        this.advamount = other.advamount;
        this.hdk = other.hdk;
        this.hdth = other.hdth;
        this.bankaccount = other.bankaccount;
        this.bankname = other.bankname;
    }
}
