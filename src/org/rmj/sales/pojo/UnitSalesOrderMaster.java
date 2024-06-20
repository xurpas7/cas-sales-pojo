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
@Table(name="Sales_Order_Master")

public class UnitSalesOrderMaster implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTransNox")
    private String sTransNox;
    
    @Column(name = "sBranchCd")
    private String sBranchCd;
    
    @Column(name = "dTransact")
    @Temporal(TemporalType.DATE)
    private Date dTransact;
    
    @Basic(optional = false)
    @Column(name = "dExpected")
    @Temporal(TemporalType.DATE)
    private Date dExpected;
    
    @Column(name = "sClientID")
    private String sClientID;
    
    @Column(name = "sReferNox")
    private String sReferNox;
    
    @Column(name = "sRemarksx")
    private String sRemarksx;
    
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
    
    @Column(name = "nForCredt")
    private Number nForCredt;
    
    @Column(name = "nCredtAmt")
    private Number nCredtAmt;
    
    @Basic(optional = false)
    @Column(name = "dDueDatex")
    @Temporal(TemporalType.DATE)
    private Date dDueDatex;
    
    @Column(name = "sTermCode")
    private String sTermCode;
    
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
    
    @Column(name = "sPrepared")
    private String sPrepared;
    
    @Basic(optional = false)
    @Column(name = "dPrepared")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dPrepared;
    
    @Column(name = "sApproved")
    private String sApproved;
    
    @Basic(optional = false)
    @Column(name = "dApproved")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dApproved;
    
    @Column(name = "sPostedxx")
    private String sPostedxx;
    
    @Basic(optional = false)
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
    
    public UnitSalesOrderMaster(){
        this.sTransNox = "";
        this.sBranchCd = "";
        this.dTransact = null;
        this.dExpected = null;
        this.sClientID = "";
        this.sReferNox = "";
        this.sRemarksx = "";
        this.nTranTotl = 0.00;
        this.nVATRatex = 0.00;
        this.nDiscount = 0.00;
        this.nAddDiscx = 0.00;
        this.nFreightx = 0.00;
        this.nAmtPaidx = 0.00;
        this.nForCredt = 0.00;
        this.nCredtAmt = 0.00;
        this.dDueDatex = null;
        this.sTermCode = "";
        this.sSourceCd = "";
        this.sSourceNo = "";
        this.nEntryNox = 0;
        this.sInvTypCd = "";
        this.cTranStat = TransactionStatus.STATE_OPEN;
        this.sPrepared = "";
        this.dPrepared = null;
        this.sApproved = "";
        this.dApproved = null;
        this.sPostedxx = "";
        this.dPostedxx = null;
        this.sModified = "";
        this.dModified = null;
        
        laColumns = new LinkedList();
        laColumns.add("sTransNox");
        laColumns.add("sBranchCd");
        laColumns.add("dTransact");
        laColumns.add("dExpected");
        laColumns.add("sClientID");
        laColumns.add("sReferNox");
        laColumns.add("sRemarksx");
        laColumns.add("nTranTotl");
        laColumns.add("nVATRatex");
        laColumns.add("nDiscount");
        laColumns.add("nAddDiscx");
        laColumns.add("nFreightx");
        laColumns.add("nAmtPaidx");
        laColumns.add("nForCredt");
        laColumns.add("nCredtAmt");
        laColumns.add("dDueDatex");
        laColumns.add("sTermCode");
        laColumns.add("sSourceCd");
        laColumns.add("sSourceNo");
        laColumns.add("nEntryNox");
        laColumns.add("sInvTypCd");
        laColumns.add("cTranStat");
        laColumns.add("sPrepared");
        laColumns.add("dPrepared");
        laColumns.add("sApproved");
        laColumns.add("dApproved");
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
    
    public void setDateExpected(Date dExpected){
        this.dExpected = dExpected;
    }
    public Date getDateExpected(){
        return dExpected;
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
    
    public void setForCredit(Number nForCredt){
        this.nForCredt = nForCredt;
    }
    public Number setForCredit(){
        return nForCredt;
    }
    
    public void setCreditAmount(Number nCredtAmt){
        this.nCredtAmt = nCredtAmt;
    }
    public Number getCreditAmount(){
        return nCredtAmt;
    }
    
    public void setDueDate(Date dDueDatex){
        this.dDueDatex = dDueDatex;
    }
    public Date getDueDate(){
        return dDueDatex;
    }
    
    public void setTermCode(String sTermCode){
        this.sTermCode = sTermCode;
    }
    public String getTemCode(){
        return sTermCode;
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
        if (!(object instanceof UnitSalesOrderMaster)) {
            return false;
        }
        UnitSalesOrderMaster other = (UnitSalesOrderMaster) object;
        if ((this.sTransNox == null && other.sTransNox != null) || (this.sTransNox != null && !this.sTransNox.equals(other.sTransNox))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.integsys.pojo.UnitSalesOrderMaster[sTransNox=" + sTransNox + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTransNox;
            case 2: return sBranchCd;
            case 3: return dTransact;
            case 4: return dExpected;
            case 5: return sClientID;
            case 6: return sReferNox;
            case 7: return sRemarksx;
            case 8: return nTranTotl;
            case 9: return nVATRatex;
            case 10: return nDiscount;
            case 11: return nAddDiscx;
            case 12: return nFreightx;
            case 13: return nAmtPaidx;
            case 14: return nForCredt;
            case 15: return nCredtAmt;
            case 16: return dDueDatex;
            case 17: return sTermCode;
            case 18: return sSourceCd;
            case 19: return sSourceNo;
            case 20: return nEntryNox;
            case 21: return sInvTypCd;
            case 22: return cTranStat;
            case 23: return sPrepared;
            case 24: return dPrepared;
            case 25: return sApproved;
            case 26: return dApproved;
            case 27: return sPostedxx;
            case 28: return dPostedxx;
            case 29: return sModified;
            case 30: return dModified;
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
        return "Sales_Order_Master";
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
            case 4: dExpected = (Date) foValue; break;
            case 5: sClientID = (String) foValue; break;
            case 6: sReferNox = (String) foValue; break;
            case 7: sRemarksx = (String) foValue; break;
            case 8: nTranTotl = (Number) foValue; break;
            case 9: nVATRatex = (Number) foValue; break;
            case 10: nDiscount = (Number) foValue; break;
            case 11: nAddDiscx = (Number) foValue; break;
            case 12: nFreightx = (Number) foValue; break;
            case 13: nAmtPaidx = (Number) foValue; break;
            case 14: nForCredt = (Number) foValue; break;
            case 15: nCredtAmt = (Number) foValue; break;
            case 16: dDueDatex = (Date) foValue; break;
            case 17: sTermCode = (String) foValue; break;
            case 18: sSourceCd = (String) foValue; break;
            case 19: sSourceNo = (String) foValue; break;
            case 20: nEntryNox = (int) foValue; break;
            case 21: sInvTypCd = (String) foValue; break;
            case 22: cTranStat = (String) foValue; break;
            case 23: sPrepared = (String) foValue; break;
            case 24: dPrepared = (Date) foValue; break;
            case 25: sApproved = (String) foValue; break;
            case 26: dApproved = (Date) foValue; break;
            case 27: sPostedxx = (String) foValue; break;
            case 28: dPostedxx = (Date) foValue; break;
            case 29: sModified = (String) foValue; break;
            case 30: dModified = (Date) foValue; break;
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
