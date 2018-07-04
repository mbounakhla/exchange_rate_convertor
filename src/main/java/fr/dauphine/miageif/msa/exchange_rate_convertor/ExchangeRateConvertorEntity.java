package fr.dauphine.miageif.msa.exchange_rate_convertor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
public class ExchangeRateConvertorEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String source;
    private String dest;
    private double taux;
    @Basic
    @Temporal(TemporalType.DATE)
    private Date date;

    public ExchangeRateConvertorEntity() {
        super();
    }

    public ExchangeRateConvertorEntity(String source, String dest, double taux, Date date) {
        super();
        this.source = source;
        this.dest = dest;
        this.taux = taux;
        this.date = date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) {
        this.taux = taux;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
