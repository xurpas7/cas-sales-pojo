/**
 * @author  Michael Cuison
 */
package org.rmj.sales.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.TransactionStatus;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="Sales_Master")

public class UnitSalesMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "dTransact")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dTransact;
    
    @Column(name = "sClientID")
    private String sClientID;
    
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
    @Column(name = "sSalesman")
    private String sSalesman;
    
    @Column(name = "cPaymForm")
    private String cPaymForm;
    
    @Column(name = "nTranTotl")
    private Number nTranTotl;
    
    @Column(name = "nVATRatex")
    private Number nVATRatex;
    
    @Column(name = "nDiscount")
    private Number nDiscount;
    
    @Column(name = "nAddDiscx")
    private Number nAddDiscx;
    
    @Column(name = "nFreightx")
    private Number nFreightx;
    
    @Column(name = "nAmtPaidx")
    private Number nAmtPaidx;
    
    @Column(name = "sTermCode")
    private String sTermCode;
    
    @Basic(optional = true)
    @Column(name = "dDueDatex")
    @Temporal(TemporalType.DATE)
    private Date dDueDatex;
    
    @Column(name = "sSourceCd")
    private String sSourceCd;
    
    @Column(name = "sSourceNo")
    private String sSourceNo;
    
    @Column(name = "nEntryNox")
    private int nEntryNox;
    
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
    
    @Column(name = "cTranStat")
    private String cTranStat;
    
    @Column(name = "nPostStat")
    private int nPostStat;
    
    @Column(name = "sPrepared")
    private String sPrepared;
    
    @Basic(optional = true)
    @Column(name = "dPrepared")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPrepared;
    
    @Column(name = "sApproved")
    private String sApproved;
    
    @Basic(optional = false)
    @Column(name = "dApproved")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dApproved;
    
    @Column(name = "sAprvCode")
    private String sAprvCode;
    
    @Column(name = "sReleased")
    private String sReleased;
    
    @Basic(optional = true)
    @Column(name = "dReleased")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dReleased;
    
    @Column(name = "sPostedxx")
    private String sPostedxx;
    
    @Basic(optional = true)
    @Column(name = "dPostedxx")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPostedxx;
    
    @Column(name = "sModified")
    private String sModified;
    
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitSalesMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.dTransact = null;
        this.sClientID = "";
        this.sReferNox = "";
        this.sRemarksx = "";
        this.sSalesman = "";
        this.cPaymForm = "";
        this.nTranTotl = 0.00;
        this.nVATRatex = 0.00;
        this.nDiscount = 0.00;
        this.nAddDiscx = 0.00;
        this.nFreightx = 0.00;
        this.nAmtPaidx = 0.00;
        this.sTermCode = "";
        this.dDueDatex = null;
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.nEntryNox = 0;
        this.sInvTypCd = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.nPostStat = 0;
        this.sPrepared = "";
        this.dPrepared = null;
        this.sApproved = "";
        this.dApproved = null;
        this.sAprvCode = "";
        this.sReleased = "";
        this.dReleased = null;
        this.sPostedxx = "";
        this.dPostedxx = null;
        this.sModified = "";
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("sClientID");
        laColumns.add("sReferNox");
        laColumns.add("sRemarksx");
        laColumns.add("sSalesman");
        laColumns.add("cPaymForm");
        laColumns.add("nTranTotl");
        laColumns.add("nVATRatex");
        laColumns.add("nDiscount");
        laColumns.add("nAddDiscx");
        laColumns.add("nFreightx");
        laColumns.add("nAmtPaidx");
        laColumns.add("sTermCode");
        laColumns.add("dDueDatex");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("nEntryNox");
        laColumns.add("sInvTypCd");
        laColumns.add("cTranStat");
        laColumns.add("nPostStat");
        laColumns.add("sPrepared");
        laColumns.add("dPrepared");
        laColumns.add("sApproved");
        laColumns.add("dApproved");
        laColumns.add("sAprvCode");
        laColumns.add("sReleased");
        laColumns.add("dReleased");
        laColumns.add("sPostedxx");
        laColumns.add("dPostedxx");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setTransNo(String sTransNox){
        this.sTransNox = sTransNox;
    }
    public String getTransNo(){
        return sTransNox;
    }
    
    public void setBranchCode(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCode(){
        return sBranchCd;
    }
    
    public void setDateTransact(Date dTransact){
        this.dTransact = dTransact;
    }
    public Date getDateTransact(){
        return dTransact;
    }
    
    public void setClientID(String sClientID){
        this.sClientID = sClientID;
    }
    public String getClientID(){
        return sClientID;
    }
    
    public void setReferenceNo(String sReferNox){
        this.sReferNox = sReferNox;
    }
    public String getReferenceNo(){
        return sReferNox;
    }
    
    public void setRemarks(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarks(){
        return sRemarksx;
    }
    
    public void setTranTotal(Number nTranTotl){
        this.nTranTotl = nTranTotl;
    }
    public Number getTranTotal(){
        return nTranTotl;
    }
    
    public void setVATRate(Number nVATRatex){
        this.nVATRatex = nVATRatex;
    }
    public Number getVATRate(){
        return nVATRatex;
    }
    
    public void setDiscount(Number nDiscount){
        this.nDiscount = nDiscount;
    }
    public Number getDiscount(){
        return nDiscount;
    }
    
    public void setAddtlDiscount(Number nAddDiscx){
        this.nAddDiscx = nAddDiscx;
    }
    public Number getAddtlDiscount(){
        return nAddDiscx;
    }
    
    public void setFreightCharge(Number nFreightx){
        this.nFreightx = nFreightx;
    }
    public Number getFreightCharge(){
        return nFreightx;
    }
    
    public void setAmountPaid(Number nAmtPaidx){
        this.nAmtPaidx = nAmtPaidx;
    }
    public Number getAmountPaid(){
        return nAmtPaidx;
    }
    
    public void setTermCode(String sTermCode){
        this.sTermCode = sTermCode;
    }
    public String getTemCode(){
        return sTermCode;
    }
    
    public void setDueDate(Date dDueDatex){
        this.dDueDatex = dDueDatex;
    }
    public Date getDueDate(){
        return dDueDatex;
    }
    
    public void setSourceCode(String sSourceCd){
        this.sSourceCd = sSourceCd;
    }
    public String getSourceCode(){
        return sSourceCd;
    }
    
    public void setSourceNo(String sSourceNo){
        this.sSourceNo = sSourceNo;
    }
    public String getSourceNo(){
        return sSourceNo;
    }
    
    public void setEntryNo(int nEntryNox){
        this.nEntryNox = nEntryNox;
    }
    public int getEntryNo(){
        return nEntryNox;
    }
    
    public void setInvTypeCode(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypeCode(){
        return sInvTypCd;
    }
    
    public void setTranStatus(String cTranStat){
        this.cTranStat = cTranStat;
    }
    public String getTranStatus(){
        return cTranStat;
    }
    
    public void setPostStat(int nPostStat){
        this.nPostStat = nPostStat;
    }
    public int getPostStat(){
        return nPostStat;
    }
    
    public void setPreparedBy(String sPrepared){
        this.sPrepared = sPrepared;
    }
    public String getPreparedBy(){
        return sPrepared;
    }
    
    public void setPreparedDate(Date dPrepared){
        this.dPrepared = dPrepared;
    }
    public Date getPreparedDate(){
        return dPrepared;
    }
    
    public void setApprovedBy(String sApproved){
        this.sApproved = sApproved;
    }
    public String getApprovedBy(){
        return sApproved;
    }
    
    public void setApprovedDate(Date dApproved){
        this.dApproved = dApproved;
    }
    public Date getApprovedDate(){
        return dApproved;
    }
    
    public void setApprovalCode(String sAprvCode){
        this.sAprvCode = sAprvCode;
    }
    public String getApprovalCode(){
        return sAprvCode;
    }
    
    public void setReleasedBy(String sReleased){
        this.sReleased = sReleased;
    }
    public String getReleasedBy(){
        return sReleased;
    }
    
    public void setReleasedDate(Date dReleased){
        this.dReleased = dReleased;
    }
    public Date getReleasedDate(){
        return dReleased;
    }
    
    public void setPostedBy(String sPostedxx){
        this.sPostedxx = sPostedxx;
    }
    public String getPostedBy(){
        return sPostedxx;
    }
    
    public void setPostedDate(Date dPostedxx){
        this.dPostedxx = dPostedxx;
    }
    public Date getPostedDate(){
        return dPostedxx;
    }
    
    public void setModifiedBy(String sModified){
        this.sModified = sModified;
    }
    public String getModifiedBy(){
        return sModified;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sTransNox != null ? sTransNox.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitSalesMaster)) {
            return false;
        }
        UnitSalesMaster other = (UnitSalesMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.integsys.pojo.UnitSalesMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return sClientID;
            case 5: return sReferNox;
            case 6: return sRemarksx;
            case 7: return sSalesman;
            case 8: return cPaymForm;
            case 9: return nTranTotl;
            case 10: return nVATRatex;
            case 11: return nDiscount;
            case 12: return nAddDiscx;
            case 13: return nFreightx;
            case 14: return nAmtPaidx;
            case 15: return sTermCode;
            case 16: return dDueDatex;
            case 17: return sSourceCd;
            case 18: return sSourceNo;
            case 19: return nEntryNox;
            case 20: return sInvTypCd;
            case 21: return cTranStat;
            case 22: return nPostStat;
            case 23: return sPrepared;
            case 24: return dPrepared;
            case 25: return sApproved;
            case 26: return dApproved;
            case 27: return sAprvCode;
            case 28: return sReleased;
            case 29: return dReleased;
            case 30: return sPostedxx;
            case 31: return dPostedxx;
            case 32: return sModified;
            case 33: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Sales_Master";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1: sTransNox = (String) foValue; break;
            case 2: sBranchCd = (String) foValue; break;
            case 3: dTransact = (Date) foValue; break;
            case 4: sClientID = (String) foValue; break;
            case 5: sReferNox = (String) foValue; break;
            case 6: sRemarksx = (String) foValue; break;
            case 7: sSalesman = (String) foValue; break;
            case 8: cPaymForm = (String) foValue; break;
            case 9: nTranTotl = (Number) foValue; break;
            case 10: nVATRatex = (Number) foValue; break;
            case 11: nDiscount = (Number) foValue; break;
            case 12: nAddDiscx = (Number) foValue; break;
            case 13: nFreightx = (Number) foValue; break;
            case 14: nAmtPaidx = (Number) foValue; break;
            case 15: sTermCode = (String) foValue; break;
            case 16: dDueDatex = (Date) foValue; break;
            case 17: sSourceCd = (String) foValue; break;
            case 18: sSourceNo = (String) foValue; break;
            case 19: nEntryNox = (int) foValue; break;
            case 20: sInvTypCd = (String) foValue; break;
            case 21: cTranStat = (String) foValue; break;
            case 22: nPostStat = (int) foValue; break;
            case 23: sPrepared = (String) foValue; break;
            case 24: dPrepared = (Date) foValue; break;
            case 25: sApproved = (String) foValue; break;
            case 26: dApproved = (Date) foValue; break;
            case 27: sAprvCode = (String) foValue; break;
            case 28: sReleased = (String) foValue; break;
            case 29: dReleased = (Date) foValue; break;
            case 30: sPostedxx = (String) foValue; break;
            case 31: dPostedxx = (Date) foValue; break;
            case 32: sModified = (String) foValue; break;
            case 33: dModified = (Date) foValue; break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    @Override
    public void list() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
