package enums;

public enum OpzioniCliente {
    CERCA_PER_COSTO("Cerca auto disponibili per costo"),
    CERCA_PER_MARCA_MODELLO("Cerca auto disponibili per marca e modello"),
    VEDI_LISTA("Vedi lista tutti auto disponibili"),
    NOLEGGIA_AUTO("Noleggia auto"),
    VEDI_PROPRI_NOLEGGI("Vedi tuoi noleggi attive"),
    ANNULLA_NOLEGGIO("Annulla noleggio"),
    ESCI("Esci");

    private final String description;

    OpzioniCliente(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}