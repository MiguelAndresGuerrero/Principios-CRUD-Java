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
    
    public CampersNuevos(String andrés_Ramírez, String string, String string1, String andresramirezemailcom, String t1, String pedro, String apolo, String bajo, String string2, String string3, String calle_45_1234_Bogotá) {};
    
    public CampersNuevos (String NombreCamperNuevo, String  ApellidoCamperNuevo, String  CorreoCamperNuevo,String  GrupoCamperNuevo,
    String  TrainerCamperNuevo, String  SalonCamperNuevo, String  RiesgoCamperNuevo, String  RutaCamperNuevo, String  FechaInicioCamperNuevo, 
    String  FechaFinCamperNuevo, String  DireccionCamperNuevo, int EdadCamperNuevo, int TelefonoCamperNuevo, int CedulaCamperNuevo){
      this.NombreCamperNuevo = NombreCamperNuevo;
      this.ApellidoCamperNuevo = ApellidoCamperNuevo;
      this.EdadCamperNuevo = EdadCamperNuevo;
      this.TelefonoCamperNuevo = TelefonoCamperNuevo;
      this.CorreoCamperNuevo = CorreoCamperNuevo;
      this.GrupoCamperNuevo = GrupoCamperNuevo;
      this.TrainerCamperNuevo = TrainerCamperNuevo;
      this.DireccionCamperNuevo = DireccionCamperNuevo;
      this.SalonCamperNuevo = SalonCamperNuevo;
      this.RiesgoCamperNuevo = RiesgoCamperNuevo;
      this.CedulaCamperNuevo = CedulaCamperNuevo;
      this.RutaCamperNuevo = RutaCamperNuevo;
      this.FechaInicioCamperNuevo = FechaInicioCamperNuevo;
      this.FechaFinCamperNuevo = FechaFinCamperNuevo;
    };

    @Override
    public String toString() {
        return "CampersNuevos{" + "NombreCamperNuevo=" + NombreCamperNuevo + ", ApellidoCamperNuevo=" + ApellidoCamperNuevo + ", CorreoCamperNuevo=" + CorreoCamperNuevo + ", GrupoCamperNuevo=" + GrupoCamperNuevo + ", TrainerCamperNuevo=" + TrainerCamperNuevo + ", SalonCamperNuevo=" + SalonCamperNuevo + ", RiesgoCamperNuevo=" + RiesgoCamperNuevo + ", RutaCamperNuevo=" + RutaCamperNuevo + ", FechaInicioCamperNuevo=" + FechaInicioCamperNuevo + ", FechaFinCamperNuevo=" + FechaFinCamperNuevo + ", DireccionCamperNuevo=" + DireccionCamperNuevo + ", EdadCamperNuevo=" + EdadCamperNuevo + ", TelefonoCamperNuevo=" + TelefonoCamperNuevo + ", CedulaCamperNuevo=" + CedulaCamperNuevo + '}';
    };
};