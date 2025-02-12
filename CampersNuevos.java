package Dia2_Java;

public class CampersNuevos {
    String  NombreCamperNuevo;
    String  ApellidoCamperNuevo;
    String  CorreoCamperNuevo;
    String  GrupoCamperNuevo;
    String  TrainerCamperNuevo;
    String  SalonCamperNuevo;
    String  RiesgoCamperNuevo;
    String  RutaCamperNuevo;
    String  FechaInicioCamperNuevo;
    String  FechaFinCamperNuevo;
    String  DireccionCamperNuevo;
    int     EdadCamperNuevo;
    int     TelefonoCamperNuevo;
    int     CedulaCamperNuevo;
    
    public CampersNuevos (String NombreCamperNuevo, String ApellidoCamperNuevo, String CorreoCamperNuevo, String GrupoCamperNuevo,
                          String TrainerCamperNuevo, String SalonCamperNuevo, String RiesgoCamperNuevo, String RutaCamperNuevo,
                          String FechaInicioCamperNuevo, String FechaFinCamperNuevo, String DireccionCamperNuevo,
                          int EdadCamperNuevo, int TelefonoCamperNuevo, int CedulaCamperNuevo) {
        this.NombreCamperNuevo = NombreCamperNuevo;
        this.ApellidoCamperNuevo = ApellidoCamperNuevo;
        this.CorreoCamperNuevo = CorreoCamperNuevo;
        this.GrupoCamperNuevo = GrupoCamperNuevo;
        this.TrainerCamperNuevo = TrainerCamperNuevo;
        this.SalonCamperNuevo = SalonCamperNuevo;
        this.RiesgoCamperNuevo = RiesgoCamperNuevo;
        this.RutaCamperNuevo = RutaCamperNuevo;
        this.FechaInicioCamperNuevo = FechaInicioCamperNuevo;
        this.FechaFinCamperNuevo = FechaFinCamperNuevo;
        this.DireccionCamperNuevo = DireccionCamperNuevo;
        this.EdadCamperNuevo = EdadCamperNuevo;
        this.TelefonoCamperNuevo = TelefonoCamperNuevo;
        this.CedulaCamperNuevo = CedulaCamperNuevo;
    }

    @Override
    public String toString() {
        return "CampersNuevos{" +
                "NombreCamperNuevo=" + NombreCamperNuevo + '\'' +
                "ApellidoCamperNuevo=" + ApellidoCamperNuevo + '\'' +
                "CorreoCamperNuevo=" + CorreoCamperNuevo + '\'' +
                "GrupoCamperNuevo=" + GrupoCamperNuevo + '\'' +
                "TrainerCamperNuevo=" + TrainerCamperNuevo + '\'' +
                "SalonCamperNuevo=" + SalonCamperNuevo + '\'' +
                "RiesgoCamperNuevo=" + RiesgoCamperNuevo + '\'' +
                "RutaCamperNuevo=" + RutaCamperNuevo + '\'' +
                "FechaInicioCamperNuevo=" + FechaInicioCamperNuevo + '\'' +
                "FechaFinCamperNuevo=" + FechaFinCamperNuevo + '\'' +
                "DireccionCamperNuevo=" + DireccionCamperNuevo + '\'' +
                "EdadCamperNuevo=" + EdadCamperNuevo +
                "TelefonoCamperNuevo=" + TelefonoCamperNuevo +
                "CedulaCamperNuevo=" + CedulaCamperNuevo +
                '}';
    }
}