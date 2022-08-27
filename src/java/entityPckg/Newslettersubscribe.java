/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entityPckg;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author GiftM
 */
@Entity
@Table(name = "NEWSLETTERSUBSCRIBE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Newslettersubscribe.findAll", query = "SELECT n FROM Newslettersubscribe n")
    , @NamedQuery(name = "Newslettersubscribe.findBySubscriptionid", query = "SELECT n FROM Newslettersubscribe n WHERE n.subscriptionid = :subscriptionid")
    , @NamedQuery(name = "Newslettersubscribe.findByIssubscribe", query = "SELECT n FROM Newslettersubscribe n WHERE n.issubscribe = :issubscribe")
    , @NamedQuery(name = "Newslettersubscribe.findByNewsletters", query = "SELECT n FROM Newslettersubscribe n WHERE n.newsletters = :newsletters")
    , @NamedQuery(name = "Newslettersubscribe.findByStartdate", query = "SELECT n FROM Newslettersubscribe n WHERE n.startdate = :startdate")
    , @NamedQuery(name = "Newslettersubscribe.findByEnddate", query = "SELECT n FROM Newslettersubscribe n WHERE n.enddate = :enddate")})
public class Newslettersubscribe implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SUBSCRIPTIONID")
    private Integer subscriptionid;
    @Column(name = "ISSUBSCRIBE")
    private Boolean issubscribe;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "NEWSLETTERS")
    private String newsletters;
    @Basic(optional = false)
    @NotNull
    @Column(name = "STARTDATE")
    @Temporal(TemporalType.DATE)
    private Date startdate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ENDDATE")
    @Temporal(TemporalType.DATE)
    private Date enddate;
    @JoinColumn(name = "USERNAME", referencedColumnName = "USERNAME")
    @ManyToOne(optional = false)
    private Users username;

    public Newslettersubscribe() {
    }

    public Newslettersubscribe(Integer subscriptionid) {
        this.subscriptionid = subscriptionid;
    }

    public Newslettersubscribe(Integer subscriptionid, String newsletters, Date startdate, Date enddate) {
        this.subscriptionid = subscriptionid;
        this.newsletters = newsletters;
        this.startdate = startdate;
        this.enddate = enddate;
    }

    public Integer getSubscriptionid() {
        return subscriptionid;
    }

    public void setSubscriptionid(Integer subscriptionid) {
        this.subscriptionid = subscriptionid;
    }

    public Boolean getIssubscribe() {
        return issubscribe;
    }

    public void setIssubscribe(Boolean issubscribe) {
        this.issubscribe = issubscribe;
    }

    public String getNewsletters() {
        return newsletters;
    }

    public void setNewsletters(String newsletters) {
        this.newsletters = newsletters;
    }

    public Date getStartdate() {
        return startdate;
    }

    public void setStartdate(Date startdate) {
        this.startdate = startdate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }

    public Users getUsername() {
        return username;
    }

    public void setUsername(Users username) {
        this.username = username;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (subscriptionid != null ? subscriptionid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Newslettersubscribe)) {
            return false;
        }
        Newslettersubscribe other = (Newslettersubscribe) object;
        if ((this.subscriptionid == null && other.subscriptionid != null) || (this.subscriptionid != null && !this.subscriptionid.equals(other.subscriptionid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entityPckg.Newslettersubscribe[ subscriptionid=" + subscriptionid + " ]";
    }
    
}
