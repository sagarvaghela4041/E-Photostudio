/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ephotostudio.admin;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dell
 */
@Entity
@Table(name = "details", catalog = "e_photostudio", schema = "")
@NamedQueries({
    @NamedQuery(name = "Details.findAll", query = "SELECT d FROM Details d")
    , @NamedQuery(name = "Details.findById", query = "SELECT d FROM Details d WHERE d.id = :id")
    , @NamedQuery(name = "Details.findByFn", query = "SELECT d FROM Details d WHERE d.fn = :fn")
    , @NamedQuery(name = "Details.findByMn", query = "SELECT d FROM Details d WHERE d.mn = :mn")
    , @NamedQuery(name = "Details.findByLn", query = "SELECT d FROM Details d WHERE d.ln = :ln")
    , @NamedQuery(name = "Details.findBySn", query = "SELECT d FROM Details d WHERE d.sn = :sn")
    , @NamedQuery(name = "Details.findByAddress", query = "SELECT d FROM Details d WHERE d.address = :address")
    , @NamedQuery(name = "Details.findByEmail", query = "SELECT d FROM Details d WHERE d.email = :email")
    , @NamedQuery(name = "Details.findByPhone", query = "SELECT d FROM Details d WHERE d.phone = :phone")
    , @NamedQuery(name = "Details.findByUn", query = "SELECT d FROM Details d WHERE d.un = :un")
    , @NamedQuery(name = "Details.findByPw", query = "SELECT d FROM Details d WHERE d.pw = :pw")})
public class Details implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "fn")
    private String fn;
    @Column(name = "mn")
    private String mn;
    @Column(name = "ln")
    private String ln;
    @Column(name = "sn")
    private String sn;
    @Column(name = "address")
    private String address;
    @Column(name = "email")
    private String email;
    @Column(name = "phone")
    private String phone;
    @Column(name = "un")
    private String un;
    @Column(name = "pw")
    private String pw;

    public Details() {
    }

    public Details(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        String oldFn = this.fn;
        this.fn = fn;
        changeSupport.firePropertyChange("fn", oldFn, fn);
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        String oldMn = this.mn;
        this.mn = mn;
        changeSupport.firePropertyChange("mn", oldMn, mn);
    }

    public String getLn() {
        return ln;
    }

    public void setLn(String ln) {
        String oldLn = this.ln;
        this.ln = ln;
        changeSupport.firePropertyChange("ln", oldLn, ln);
    }

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        String oldSn = this.sn;
        this.sn = sn;
        changeSupport.firePropertyChange("sn", oldSn, sn);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        String oldEmail = this.email;
        this.email = email;
        changeSupport.firePropertyChange("email", oldEmail, email);
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        String oldPhone = this.phone;
        this.phone = phone;
        changeSupport.firePropertyChange("phone", oldPhone, phone);
    }

    public String getUn() {
        return un;
    }

    public void setUn(String un) {
        String oldUn = this.un;
        this.un = un;
        changeSupport.firePropertyChange("un", oldUn, un);
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        String oldPw = this.pw;
        this.pw = pw;
        changeSupport.firePropertyChange("pw", oldPw, pw);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Details)) {
            return false;
        }
        Details other = (Details) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ephotostudio.admin.Details[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
