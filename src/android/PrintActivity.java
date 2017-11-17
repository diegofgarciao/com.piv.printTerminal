package com.piv.print;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import android.*;
import org.json.JSONObject;

import android.app.Activity;
import android.os.Bundle;
/*import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;*/

import com.socsi.smartposapi.printer.Align;
import com.socsi.smartposapi.printer.FontLattice;
import com.socsi.smartposapi.printer.FontType;
import com.socsi.smartposapi.printer.PrintRespCode;
import com.socsi.smartposapi.printer.Printer2;
import com.socsi.smartposapi.printer.TextEntity;


public class PrintActivity extends CordovaPlugin {

private CallbackContext callbackContext;
private String vuelta = "PIVPluginPrintVerificado";
private String out = "";
private String rta;
private String msgIn;
private String vacio;

    @Override
        /*public boolean execute(String action, final String args, CallbackContext callbackContext){*/
          public boolean execute(String action, final JSONArray args, CallbackContext callbackContext){

            if(action.equals("verificarPluginJava")){
                rta = args + out ;
                callbackContext.success(rta);
            }

            else if (action.equals("printinTerminal")) {

                vacio = out;

                Printer2 print = Printer2.getInstance();

                TextEntity text =  new TextEntity(vacio, null, false, null);
                //TextEntity textOne =  new TextEntity(" ", null, false, null);
                print.appendTextEntity2(text);

            String titlePrint = new String();
            String subtitlePrint = new String();
            String ubicationPrint = new String();
            String nitPrint = new String();
            String addressPrint = new String();
            String phonenumberPrint = new String();
            String ticketnamePrint = new String();
            String alertdatePrint = new String();
            String limitdatePrint = new String();
            String saledatePrint = new String();
            String actualhourPrint = new String();
            String licenseplatePrint = new String();
            String timePrint = new String();
            String valuecheckPrint = new String();
            String alerthourPrint = new String();
            String limithourPrint = new String();
            String endhourPrint = new String();
            String zonePrint = new String();
            String saleidPrint = new String();
            String alertidPrint = new String();
            String fractionvaluePrint = new String();
            String fractiontimePrint = new String();
            String observationonePrint = new String();
            String observationsecondPrint = new String();
            String recommendationnamePrint = new String();
            String recommendationtextPrint = new String();
            String footeronePrint = new String();
            String footersecondPrint = new String();


                JSONArray obj = new JSONArray();
                obj = args;
                try{
                for(int i = 0; i < obj.length(); i++){
                    JSONObject jsonobject = obj.getJSONObject(i);
                    //----------------------------------------------------------------------------
                    titlePrint = jsonobject.getString("titulo");
                    text.text=titlePrint;
                    text.isBoldFont=false;
                    text.engFontType= FontType.FZZDX;
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    text.newline=true;
                    print.appendTextEntity2(text);
                    //----------------------------------------------------------------------------
                    subtitlePrint = jsonobject.getString("subtitulo");
                    text.text=subtitlePrint;
                    text.isBoldFont=false;
                    text.engFontType= FontType.FZZDX;
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    text.newline=true;
                    print.appendTextEntity2(text);
                    //----------------------------------------------------------------------------
                    ubicationPrint = jsonobject.getString("ubicacion");
                    text.text=ubicationPrint;
                    text.isBoldFont=false;
                    text.engFontType= FontType.FZZDX;
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //----------------------------------------------------------------------------
                    nitPrint = jsonobject.getString("nit");
                    text.text="NIT : " + nitPrint;
                    text.isBoldFont=true;
                    text.engFontType= FontType.MSGOTHIC;
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //---------------------------------------------------------------------------
                    addressPrint = jsonobject.getString("direccion");
                    text.text=addressPrint;
                    text.isBoldFont=true;
                    text.engFontType= FontType.MSGOTHIC;
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //---------------------------------------------------------------------------
                    phonenumberPrint = jsonobject.getString("telefono");
                    text.text=phonenumberPrint;
                    text.isBoldFont=true;
                    text.engFontType= FontType.MSGOTHIC;
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //---------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //---------------------------------------------------------------------------
                    ticketnamePrint = jsonobject.getString("nombrerecibo");
                    text.text=ticketnamePrint;
                    text.isBoldFont=true;
                    text.engFontType= FontType.FZZDX;
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.THIRTY_TWO;
                    print.appendTextEntity2(text);

                }
                }catch(Exception e){
                callbackContext.error(e.toString());
                }


                /*text.text="NIT : 890.980.331-6";
                text.isBoldFont=true;
                text.engFontType= FontType.MSGOTHIC;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="DIR: Calle XX Sur #YY-XX";
                text.isBoldFont=true;
                text.engFontType= FontType.MSGOTHIC;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="TEL: 3X4X5X6X";
                text.isBoldFont=true;
                text.engFontType= FontType.MSGOTHIC;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="";
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="ALERTA DE COBRO";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.THIRTY_TWO;
                print.appendTextEntity2(text);

                text.text="";
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="Fecha:2017/11/16";
                text.isBoldFont=false;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="Hora:17:30";
                text.isBoldFont=false;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="PLACA:ABC123";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.THIRTY_TWO;
                print.appendTextEntity2(text);

                text.text="Zona:X01";
                text.isBoldFont=false;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="Consecutivo:000000";
                text.isBoldFont=false;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="Valor:$0000";
                text.isBoldFont=false;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="";
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="Señor Usuario: Pague el valor unicamente al informador";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.SIXTEEN;
                print.appendTextEntity2(text);

                text.text="Ubique este tiquete en su vehículo con esta cara hacia arriba en un lugar visible";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.SIXTEEN;
                print.appendTextEntity2(text);

                text.text="";
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="Recomendaciones y condiciones.";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="Conserve y asegure su tiquete, tenga presente el valor de la tarifa y los horarios. Deje su vehiculo correctamente estacionado dentro de la celda. No nos hacemos responsables por robos danos causados por terceros, terremotos, incendio, alborotos populares o asonada. Deje su vehiculo debidamente cerrado y asegurado. Las motos deben estacionar unica y exclusivamente en las celdas destinadas para ellas. Los espacios de estacionamiento no pueden usarse como deposito ni permanentes ni temporales y solo estan destinados para el estacionamiento de vehiculos. El estacionamiento en lugares no permitidos puede ocasionar penalizacion por parte del organismo de transito. Estacionarse sin cancelar el valor por el estacionamiento puede ocasionar penalizacion por parte del organismo de transito.";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.LEFT;
                text.engfontsize=FontLattice.SIXTEEN;
                print.appendTextEntity2(text);

                text.text="";
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.SIXTEEN;
                print.appendTextEntity2(text);

                text.text="Visite nuestra pagina web";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.SIXTEEN;
                print.appendTextEntity2(text);

                text.text="www.sespiv.co";
                text.isBoldFont=true;
                text.engFontType= FontType.FZZDX;
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.TWENTY_FOUR;
                print.appendTextEntity2(text);

                text.text="";
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.SIXTEEN;
                print.appendTextEntity2(text);

                text.text="";
                text.align= Align.CENTER;
                text.engfontsize=FontLattice.SIXTEEN;
                print.appendTextEntity2(text);*/

                PrintRespCode printRespCode = print.startPrint();
                callbackContext.success(printRespCode.toString());
                //Log.i("PrintActivity", printRespCode.toString().toString());
             }
            return true;
        }
}