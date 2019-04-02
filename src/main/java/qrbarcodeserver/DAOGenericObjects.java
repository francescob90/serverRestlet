package qrbarcodeserver;

import java.util.HashMap;
import java.util.Map;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class DAOGenericObjects extends ServerResource implements IDAOGenericObject,IGenericObject {

	@Override
	//public GenericObject charge(String fileName) {
	public Repository charge(String fileName) {
		Repository repository = new Repository();
                
                GenericObject gen1 = new GenericObject();
                GenericObject gen2 = new GenericObject();
                GenericObject gen3 = new GenericObject();
                GenericObject gen4 = new GenericObject();
                GenericObject gen5 = new GenericObject();
                GenericObject gen6 = new GenericObject();
                GenericObject gen7 = new GenericObject();
                GenericObject gen8 = new GenericObject();
		
                gen1.setId("123456");
                gen1.setTipo("Persona");
                gen1.putString("Nome", "Francesco");
                gen1.putString("Cognome", "Barbella");
                gen1.putString("Mail", "francesco.barbella@gmail.com");
                gen1.putString("Facebook","https://www.facebook.com/francesco.barbella.3");
                gen1.putString("Instagram","https://www.instagram.com/francescob90/");
		
                gen2.setId("FB274KL");
                gen2.setTipo("Auto");
                gen2.putString("Targa", "FB274KL");
                gen2.putString("Nome", "Panda");
                gen2.putString("Costruttore", "Fiat");
                gen2.putString("Alimentazione", "Benzina");
		
                gen3.setId("978882021223");
                gen3.setTipo("Libro");
                gen3.putString("isdn", "978882021223");
                gen3.putString("Titolo", "20000 leghe sotto i mari");
                gen3.putString("Prezzo", "18,00 euro");
               
               
                gen4.setId("BRBFNC90E05E977G");
                gen4.setTipo("Codice Fiscale");
                gen4.putString("Nome", "Francesco");
                gen4.putString("Cognome", "Barbella");
                gen4.putString("Nato", "Marsicovetere");
                gen4.putString("Data", "05-05-1990");
                gen4.putString("Mail", "francesco.barbella@gmail.com");
                gen4.putString("Tel", "3899958414");
                
                gen5.setId("DellXPS15");
                gen5.setTipo("PcPortatile");
                gen5.putString("Marca", "Dell");
                gen5.putString("Nome", "XPS15");
                gen5.putString("Processore", "Inteli7");
                gen5.putString("Ram", "8GBDDR4");
                gen5.putString("HD", "SSD256GB");
                gen5.putString("Sito", "https://www.dell.com/it-it/shop/notebook-dell/xps-15/spd/xps-15-9550-laptop");
                gen5.putString("Recensione", "https://www.youtube.com/watch?v=GSP6IOEq8KM&t=434s");
                gen5.putString("Assistenza", "info@dell.com");
                gen5.putString("Acquista", "https://www.amazon.it/i7-7700HQ-generazione-1080Pixel-Computer-portatile/dp/B073XGP26F/ref=sr_1_2?s=pc&ie=UTF8&qid=1550870607&sr=1-2&keywords=DELL+XPS+15+9560");
                //gen5.putString("Posizione", "https://www.google.com/maps/place/SS276,+103-21,+85050+Paterno+PZ/@40.3898039,15.714627,15z/data=!4m5!3m4!1s0x1339264acefa9cd7:0x742436ff46f2977d!8m2!3d40.3799732!4d15.734624");
                gen5.putString("Posizione", "geo:40.3898039,15.714627");
                
                gen6.setId("8008417001209");
                gen6.setTipo("Acqua");
                gen6.putString("Marca", "Sveva");
                gen6.putString("Quantità", "500ml");
                gen6.putString("Prezzo", "0.20€");
                gen6.putString("TipoContenitore", "BottigliaPET");
                gen6.putString("Produttore", "FontidelVultureS.R.L.");
                gen6.putString("Tel", "800836000");
                gen6.putString("Stabilimento", "Rionero(PZ)");
                gen6.putString("Posizione2", "https://www.google.it/maps/place/Fonti+del+Vulture/@40.8931424,15.6674695,17z/data=!3m1!4b1!4m5!3m4!1s0x1339a90d743748e3:0xdb3a40ef35d8239e!8m2!3d40.8931384!4d15.6696582)");
                gen6.putString("Posizione", "geo:40.8931424,15.6674695");
                
                gen7.setId("9781935182344");
                gen7.setTipo("LibroRestlet");
                gen7.putString("Titolo", "RestletInAction");
                gen7.putString("Editore", "Manning");
                gen7.putString("Autore1", "JeromeLouvel");
                gen7.putString("Autore2", "ThierryTemplier");
                gen7.putString("Autore3", "ThierryBoileau");
                gen7.putString("Pagine", "464pages");
                gen7.putString("ISBN", "9781935182344");
                gen7.putString("Prezzo", "49,90€");
                gen7.putString("Sito", "https://www.manning.com/books/restlet-in-action");
                
                gen8.setId("9780201379624");
                gen8.setTipo("Smartbox");
                gen8.putString("Titolo", "ViaggiaConNoi");
                gen8.putString("DataPartenza", "05/05/2019");
                gen8.putString("DataRientro", "15/05/2019");
                gen8.putString("CittaPartenza", "Napoli");
                gen8.putString("CittaRientro", "Oslo");
                gen8.putString("PercorsoAndata", "https://www.google.com/maps/dir/Napoli,+Citt%C3%A0+Metropolitana+di+Napoli/Oslo,+Norvegia/@50.0498768,2.863789,5z/data=!4m14!4m13!1m5!1m1!1s0x133b0866db7afaeb:0xd23a43cc658cb87e!2m2!1d14.2681244!2d40.8517746!1m5!1m1!1s0x46416e61f267f039:0x7e92605fd3231e9a!2m2!1d10.7522454!2d59.9138688!5i2");
                gen8.putString("PercorsoRitorno", "https://www.google.com/maps/dir/Oslo,+Norvegia/Napoli,+Citt%C3%A0+Metropolitana+di+Napoli/@50.0499503,1.5876385,5z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x46416e61f267f039:0x7e92605fd3231e9a!2m2!1d10.7522454!2d59.9138688!1m5!1m1!1s0x133b0866db7afaeb:0xd23a43cc658cb87e!2m2!1d14.2681244!2d40.8517746");
                gen8.putString("Albergo", "https://www.booking.com/hotel/no/radisson-blu-plaza-oslo.it.html?aid=394916;label=oslo-lSbDzg_46sk3%2AJc2kYyPYAS43975858502%3Apl%3Ata%3Ap1145%3Ap2%3Aac%3Aap1t1%3Aneg%3Afi%3Atiaud-285284110726%3Akwd-658124822%3Alp20590%3Ali%3Adec%3Adm;sid=77b0794c970d08cb911ee4e817da5c6e;dest_id=-273837;dest_type=city;dist=0;hapos=3;hpos=3;nflt=sth%253D7;room1=A%2CA;sb_price_type=total;srepoch=1550874333;srfid=3ed77fb5e761a554f7caeb5b365f3f60a52fa550X3;srpvid=a02c9dae4d6803c3;type=total;ucfs=1&#hotelTmpl");
                gen8.putString("Video", "https://www.youtube.com/watch?v=54LY1DwfbwM");
                
		
		repository.put("Risorsa1",gen1);
		repository.put("Risorsa2",gen2);
                repository.put("Risorsa3", gen3);
                repository.put("Risorsa4", gen4);
                repository.put("Risorsa5", gen5);
                repository.put("Risorsa6", gen6);
                repository.put("Risorsa7", gen7);
                repository.put("Risorsa8", gen8);
                
                //repository.put("Risorsa4", gen4);
                
                
		
		return repository;
                
		//return gen1;
	}

//    @Override
//    public GenericObject retrive() {
//        Repository repository = new Repository();
//        String id = "1234";
//        return repository.find(id);
//    }
    
//    @Get
//	public String toString() {
//            Model model = new Model();
//            String testo = (String)  model.get(Costanti.JSON);
//            System.out.println("qrbarcodeserver.DAOGenericObject.toString()"+ testo);
//            //GenericObject testo = resourcesList.get(0);
//            return "scrivi json" + testo;
//	}
    
    public GenericObject caricaOggetto(){
        GenericObject genericObject = new GenericObject();
            genericObject.putString("Nome", "francesco");
            genericObject.putString("COgnome", "barbella");
          
            
        return  genericObject;
    }
    
    public GenericObject caricaOggetto2(String codice){
        GenericObject genericObject = new GenericObject();
        if((codice.equals("1234"))){
            genericObject.setId(codice);
            genericObject.setTipo("Persona");
            genericObject.putString("Nome", "francesco");
            genericObject.putString("Cognome", "barbella");
            return genericObject;
        }else if(codice.equals("5678")){
            genericObject.setId(codice);
            genericObject.setTipo("Automobile");
            genericObject.putString("nome", "Panda");
            genericObject.putString("costruttore", "Fiat");
            genericObject.putString("Alimentazione", "Benzina");
            return genericObject;
        }else if(codice.equals("91011")){
            genericObject.setId(codice);
            genericObject.setTipo("Libro");
            genericObject.putString("isdn", "97888-202122");
            genericObject.putString("Titolo", "20000 leghe sotto i mari");
            genericObject.putString("prezzo", "18,00 euro");
            return genericObject;
        }
        return  null;
    }
    
    @Get
    public String toString(){
        return "DAOGenericObjects";
    }

    @Override
    public GenericObject retrive() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
