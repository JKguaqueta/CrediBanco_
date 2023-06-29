import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroTarjeta; // Número de la Card
    private String nombreTitular; // Nombre del titular de la cuenta
    private LocalDate fechaVencimiento; // Fecha de vencimiento de la Card
    private boolean activa; // Si está activa
    private boolean bloqueada; // Si está bloqueada

    public Card() {
        // Constructor vacío requerido por JPA
    }

    public Card(String numeroTarjeta, String nombreTitular, LocalDate fechaCreacion) {
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
        this.fechaVencimiento = fechaCreacion.plusYears(3);
        this.activa = false;
        this.bloqueada = false;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getnumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setnumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public boolean getActiva() {
        return activa;
    }

    public void setBloqueada(boolean bloqueada) {
        this.bloqueada = bloqueada;
    }

    public boolean getBloqueada() {
        return bloqueada;
    }
}
