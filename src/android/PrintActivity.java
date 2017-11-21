
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

        if(action.equals("verificarPluginJava"))
        {
            rta = args + out ;
            callbackContext.success(rta);
        }

        else if (action.equals("printPrepago"))
        {
            /*vacio = out;
            Printer2 print = Printer2.getInstance();
            TextEntity text =  new TextEntity(vacio, null, false, null);
            //TextEntity textOne =  new TextEntity(" ", null, false, null);
            print.appendTextEntity2(text);

            text.text = "Pruebas Pruebas Pruebas 1";
            text.isBoldFont = false;
            text.engFontType = FontType.FZZDX;
            text.align = Align.CENTER;
            text.engfontsize = FontLattice.TWENTY_FOUR;
            text.newline = true;
            print.appendTextEntity2(text);

            text.text = "Pruebas Pruebas Pruebas 2";
            text.isBoldFont = false;
            text.engFontType = FontType.FZZDX;
            text.align = Align.CENTER;
            text.engfontsize = FontLattice.TWENTY_FOUR;
            text.newline = true;
            print.appendTextEntity2(text);

            text.text = "Pruebas Pruebas Pruebas 3";
            text.isBoldFont = false;
            text.engFontType = FontType.FZZDX;
            text.align = Align.CENTER;
            text.engfontsize = FontLattice.TWENTY_FOUR;
            text.newline = true;
            print.appendTextEntity2(text);*/


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
                    //------------------------------------------------------------------------------
                    titlePrint = jsonobject.getString("titulo");
                    if(titlePrint == "null"){
                        //callbackContext.success("Valueoff titulo");
                    }else {
                        text.text = titlePrint;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    subtitlePrint = jsonobject.getString("subtitulo");
                    if(subtitlePrint == "null"){
                        //callbackContext.success("Valueoff subtitulo");
                    }else {
                        text.text = subtitlePrint;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    ubicationPrint = jsonobject.getString("ubicacion");
                    if(ubicationPrint == "null"){
                        //callbackContext.success("Valueoff ubicacion");
                    }else{
                        text.text = ubicationPrint;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    nitPrint = jsonobject.getString("nit");
                    if(nitPrint == "null"){
                        //callbackContext.success("Valueoff nit");
                    }else {
                        text.text = "NIT : " + nitPrint;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    addressPrint = jsonobject.getString("direccion");
                    if(addressPrint == "null"){
                        //callbackContext.success("Valueoff direccion");
                    }else {
                        text.text = "DIR : " + addressPrint;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    phonenumberPrint = jsonobject.getString("telefono");
                    if(phonenumberPrint == "null"){
                        //callbackContext.success("Valueoff telefono");
                    }else {
                        text.text = "TEL : " + phonenumberPrint;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    ticketnamePrint = jsonobject.getString("nombrerecibo");
                    if(ticketnamePrint == "null"){
                        //callbackContext.success("Valueoff nombrerecibo");
                    }else {
                        text.text = ticketnamePrint;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    alertdatePrint = jsonobject.getString("fechaalerta");
                    if(alertdatePrint == "null"){
                        //callbackContext.success("Valueoff fechaalerta");
                    }else{
                        text.text="Fecha Alerta: " + alertdatePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    limitdatePrint = jsonobject.getString("fechalimite");
                    if(limitdatePrint == "null"){
                        //callbackContext.success("Valueoff fechalimite");
                    }else{
                        text.text="Fecha Limite: "+limitdatePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    saledatePrint = jsonobject.getString("fechaventa");
                    if(saledatePrint == "null"){
                        //callbackContext.success("Valueoff fechaventa");
                    }else{
                        text.text="Fecha Pago: "+saledatePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    actualhourPrint = jsonobject.getString("horaactual");
                    if(actualhourPrint == "null"){
                        //callbackContext.success("Valueoff horaactual");
                    }else{
                        text.text="Hora: " + actualhourPrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    licenseplatePrint =  jsonobject.getString("placa");
                    if(licenseplatePrint == "null"){
                        //callbackContext.success("Valueoff placa");
                    }else{
                        text.text="PLACA: " + licenseplatePrint;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    timePrint = jsonobject.getString("tiempo");
                    if(timePrint == "null"){
                        //callbackContext.success("Valueoff tiempo");
                    }else{
                        text.text="Tiempo: "+timePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    valuecheckPrint = jsonobject.getString("valorpagado");
                    if(valuecheckPrint == "null"){
                        //callbackContext.success("Valueoff valorpagado");
                    }else{
                        text.text="Valor Pagado: " + valuecheckPrint;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alerthourPrint = jsonobject.getString("horaalerta");
                    if(alerthourPrint == "null"){
                        //callbackContext.success("Valueoff horaalerta");
                    }else{
                        text.text="Valido desde: "+alerthourPrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    limithourPrint = jsonobject.getString("horalimite");
                    if(limithourPrint == "null"){
                        //callbackContext.success("Valueoff horalimite");
                    }else{
                        text.text="Valido hasta: " + limithourPrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    endhourPrint = jsonobject.getString("horafin");
                    if(endhourPrint == "null"){
                        //callbackContext.success("Valueoff horafin");
                    }else{
                        text.text="Hora Fin: " + timePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    zonePrint = jsonobject.getString("zona");
                    if(zonePrint == "null"){
                        //callbackContext.success("Valueoff zona");
                    }else{
                        text.text="Zona: " + zonePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alertidPrint = jsonobject.getString("idalerta");
                    if(alertidPrint == "null"){
                        //callbackContext.success("Valueoff idalerta");
                    }else{
                        text.text="IdAlerta: " + alertidPrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    saleidPrint = jsonobject.getString("idventa");
                    if(saleidPrint == "null"){
                        //callbackContext.success("Valueoff idventa");
                    }else{
                        text.text="Consecutivo: " + saleidPrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractionvaluePrint = jsonobject.getString("valorfraccion");
                    if(fractionvaluePrint == "null"){
                        //callbackContext.success("Valueoff valorfraccion");
                    }else{
                        text.text="Valor: "+fractionvaluePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractiontimePrint = jsonobject.getString("tiempofraccion");
                    if(fractiontimePrint == "null"){
                        //callbackContext.success("Valueoff tiempofraccion");
                    }else{
                        text.text="Tarifa: " + fractiontimePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    observationonePrint = jsonobject.getString("observacion1");
                    if(observationonePrint == "null"){
                        //callbackContext.success("Valueoff observacion1");
                    }else{
                        text.text=observationonePrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    observationsecondPrint = jsonobject.getString("observacion2");
                    if(observationsecondPrint == "null"){
                        //callbackContext.success("Valueoff observacion1");
                    }else{
                        text.text=observationsecondPrint;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    recommendationnamePrint = jsonobject.getString("nombrerecomendaciones");
                    if(recommendationnamePrint == "null"){
                        //callbackContext.success("Valueoff nombrerecomendaciones");
                    }else{
                        text.text=recommendationnamePrint;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    recommendationtextPrint = jsonobject.getString("textorecomendaciones");
                    if(recommendationtextPrint == "null"){
                        //callbackContext.success("Valueoff textorecomendaciones");
                    }else{
                        text.text = recommendationtextPrint;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    footeronePrint = jsonobject.getString("pie1");
                    if(footeronePrint == "null"){
                        //callbackContext.success("Valueoff pie1");
                    }else{
                        text.text=footeronePrint;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    footersecondPrint = jsonobject.getString("pie2");
                    if(footersecondPrint == "null"){
                        //callbackContext.success("Valueoff pie2");
                    }else{
                        text.text=footersecondPrint;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                }
            }catch(Exception e){
                callbackContext.error(e.toString());
            }
            //--------------------------------------------------------------------------------------
            PrintRespCode printRespCode = print.startPrint();
            callbackContext.success(printRespCode.toString());

        }else if(action.equals("printGenerarAlerta"))
        {
            vacio = out;
            Printer2 print = Printer2.getInstance();
            TextEntity text =  new TextEntity(vacio, null, false, null);
            //TextEntity textOne =  new TextEntity(" ", null, false, null);
            print.appendTextEntity2(text);

            String titleGenerarAlerta = new String();
            String subtitleGenerarAlerta = new String();
            String ubicationGenerarAlerta = new String();
            String nitGenerarAlerta = new String();
            String addressGenerarAlerta = new String();
            String phonenumberGenerarAlerta = new String();
            String ticketnameGenerarAlerta = new String();
            String alertdateGenerarAlerta = new String();
            String alerthourGenerarAlerta = new String();
            String licenseplateGenerarAlerta = new String();
            String zoneGenerarAlerta = new String();
            String alertidGenerarAlerta = new String();
            String fractiontimeGenerarAlerta = new String();
            String fractionvalueGenerarAlerta = new String();
            String observationoneGenerarAlerta = new String();
            String observationsecondGenerarAlerta = new String();
            String recommendationnameGenerarAlerta = new String();
            String recommendationtextGenerarAlerta = new String();
            String footeroneGenerarAlerta = new String();
            String footersecondGenerarAlerta = new String();

            JSONArray obj = new JSONArray();
            obj = args;
            try{
                for(int i = 0; i < obj.length(); i++) {
                    JSONObject jsonobject = obj.getJSONObject(i);
                    //------------------------------------------------------------------------------
                    titleGenerarAlerta = jsonobject.getString("titulo");
                    if (titleGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff titulo");
                    } else {
                        text.text = titleGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    subtitleGenerarAlerta = jsonobject.getString("subtitulo");
                    if (subtitleGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff subtitulo");
                    } else {
                        text.text = subtitleGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    ubicationGenerarAlerta = jsonobject.getString("ubicacion");
                    if (ubicationGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff ubicacion");
                    } else {
                        text.text = ubicationGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    nitGenerarAlerta = jsonobject.getString("nit");
                    if (nitGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff nit");
                    } else {
                        text.text = "NIT : " + nitGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    addressGenerarAlerta = jsonobject.getString("direccion");
                    if (addressGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff direccion");
                    } else {
                        text.text = "DIR : " + addressGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    phonenumberGenerarAlerta = jsonobject.getString("telefono");
                    if (phonenumberGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff telefono");
                    } else {
                        text.text = "TEL : " + phonenumberGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    ticketnameGenerarAlerta = jsonobject.getString("nombrerecibo");
                    if (ticketnameGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff nombrerecibo");
                    } else {
                        text.text = ticketnameGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    alertdateGenerarAlerta = jsonobject.getString("fechaalerta");
                    if (alertdateGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff fechalerta");
                    } else {
                        text.text = "Fecha Alerta: " + alertdateGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alerthourGenerarAlerta = jsonobject.getString("horaalerta");
                    if (alerthourGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff horaalerta");
                    } else {
                        text.text = "Hora : " + alerthourGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    licenseplateGenerarAlerta = jsonobject.getString("placa");
                    if (licenseplateGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff placa");
                    } else {
                        text.text = "PLACA: " + licenseplateGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    zoneGenerarAlerta = jsonobject.getString("zona");
                    if (zoneGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff zona");
                    } else {
                        text.text = "Zona: " + zoneGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alertidGenerarAlerta = jsonobject.getString("idalerta");
                    if (alertidGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff idalerta");
                    } else {
                        text.text = "Consecutivo: " + alertidGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractiontimeGenerarAlerta = jsonobject.getString("tiempofraccion");
                    if (fractiontimeGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff tiempofraccion");
                    } else {
                        text.text = "Fraccion: " + fractiontimeGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractionvalueGenerarAlerta = jsonobject.getString("valorfraccion");
                    if (fractionvalueGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff valorfraccion");
                    } else {
                        text.text = "Valor: " +  fractionvalueGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    observationoneGenerarAlerta = jsonobject.getString("observacion1");
                    if (observationoneGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff observacion1");
                    } else {
                        text.text = observationoneGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    observationsecondGenerarAlerta = jsonobject.getString("observacion2");
                    if (observationsecondGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff observacion1");
                    } else {
                        text.text = observationsecondGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    recommendationnameGenerarAlerta = jsonobject.getString("nombrerecomendaciones");
                    if (recommendationnameGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff nombrerecomendaciones");
                    } else {
                        text.text = recommendationnameGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    recommendationtextGenerarAlerta = jsonobject.getString("textorecomendaciones");
                    if (recommendationtextGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff textorecomendaciones");
                    } else {
                        text.text = recommendationtextGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    footeroneGenerarAlerta = jsonobject.getString("pie1");
                    if (footeroneGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff pie1");
                    } else {
                        text.text = footeroneGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    footersecondGenerarAlerta = jsonobject.getString("pie2");
                    if (footersecondGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff pie2");
                    }else {
                        text.text = footersecondGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                }
            }catch (Exception e){
                callbackContext.error(e.toString());
            }
            //------------------------------------------------------------------------------
            PrintRespCode printRespCode = print.startPrint();
            callbackContext.success(printRespCode.toString());
            //Log.i("PrintActivity", printRespCode.toString().toString());
        }else if(action.equals("printPagaralerta")){

            vacio = out;
            Printer2 print = Printer2.getInstance();
            TextEntity text =  new TextEntity(vacio, null, false, null);
            //TextEntity textOne =  new TextEntity(" ", null, false, null);
            print.appendTextEntity2(text);

            String titlePagaralerta = new String();
            String subtitlePagaralerta = new String();
            String ubicationPagaralerta = new String();
            String nitPagaralerta = new String();
            String addressPagaralerta = new String();
            String phonenumberPagaralerta = new String();
            String ticketnamePagaralerta = new String();
            String alertdatePagaralerta = new String();
            String limitdatePagaralerta = new String();
            String saledatePagaralerta = new String();
            String actualhourPagaralerta = new String();
            String licenseplatePagaralerta = new String();
            String timePagaralerta = new String();
            String valuecheckPagaralerta = new String();
            String alerthourPagaralerta = new String();
            String limithourPagaralerta = new String();
            String endhourPagaralerta = new String();
            String zonePagaralerta = new String();
            String saleidPagaralerta = new String();
            String alertidPagaralerta = new String();
            String fractionvaluePagaralerta = new String();
            String fractiontimePagaralerta = new String();
            String observationonePagaralerta = new String();
            String observationsecondPagaralerta = new String();
            String recommendationnamePagaralerta = new String();
            String recommendationtextPagaralerta = new String();
            String footeronePagaralerta = new String();
            String footersecondPagaralerta = new String();

            JSONArray obj = new JSONArray();
            obj = args;
            try{
                for(int i = 0; i < obj.length(); i++){
                    JSONObject jsonobject = obj.getJSONObject(i);
                    //------------------------------------------------------------------------------
                    titlePagaralerta = jsonobject.getString("titulo");
                    if(titlePagaralerta == "null"){
                        //callbackContext.success("Valueoff titulo");
                    }else {
                        text.text = titlePagaralerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    subtitlePagaralerta = jsonobject.getString("subtitulo");
                    if(subtitlePagaralerta == "null"){
                        //callbackContext.success("Valueoff subtitulo");
                    }else {
                        text.text = subtitlePagaralerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    ubicationPagaralerta = jsonobject.getString("ubicacion");
                    if(ubicationPagaralerta == "null"){
                        //callbackContext.success("Valueoff ubicacion");
                    }else{
                        text.text = ubicationPagaralerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    nitPagaralerta = jsonobject.getString("nit");
                    if(nitPagaralerta == "null"){
                        //callbackContext.success("Valueoff nit");
                    }else {
                        text.text = "NIT : " + nitPagaralerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    addressPagaralerta = jsonobject.getString("direccion");
                    if(addressPagaralerta == "null"){
                        //callbackContext.success("Valueoff direccion");
                    }else {
                        text.text = "DIR : " + addressPagaralerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    phonenumberPagaralerta = jsonobject.getString("telefono");
                    if(phonenumberPagaralerta == "null"){
                        //callbackContext.success("Valueoff telefono");
                    }else {
                        text.text = "TEL : " + phonenumberPagaralerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    ticketnamePagaralerta = jsonobject.getString("nombrerecibo");
                    if(ticketnamePagaralerta == "null"){
                        //callbackContext.success("Valueoff nombrerecibo");
                    }else {
                        text.text = ticketnamePagaralerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    alertdatePagaralerta = jsonobject.getString("fechaalerta");
                    if(alertdatePagaralerta == "null"){
                        //callbackContext.success("Valueoff fechaalerta");
                    }else{
                        text.text="Fecha Alerta: " + alertdatePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    limitdatePagaralerta = jsonobject.getString("fechalimite");
                    if(limitdatePagaralerta == "null"){
                        //callbackContext.success("Valueoff fechalimite");
                    }else{
                        text.text="Fecha Limite: "+ limitdatePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    saledatePagaralerta = jsonobject.getString("fechaventa");
                    if(saledatePagaralerta == "null"){
                        //callbackContext.success("Valueoff fechaventa");
                    }else{
                        text.text="Fecha Pago: "+ saledatePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    actualhourPagaralerta = jsonobject.getString("horaactual");
                    if(actualhourPagaralerta == "null"){
                        //callbackContext.success("Valueoff horaactual");
                    }else{
                        text.text="Hora: " + actualhourPagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    licenseplatePagaralerta =  jsonobject.getString("placa");
                    if(licenseplatePagaralerta == "null"){
                        //callbackContext.success("Valueoff placa");
                    }else{
                        text.text="PLACA: " + licenseplatePagaralerta;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    timePagaralerta = jsonobject.getString("tiempo");
                    if(timePagaralerta == "null"){
                        //callbackContext.success("Valueoff tiempo");
                    }else{
                        text.text="Tiempo: "+timePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    valuecheckPagaralerta = jsonobject.getString("valorpagado");
                    if(valuecheckPagaralerta == "null"){
                        //callbackContext.success("Valueoff valorpagado");
                    }else{
                        text.text="Valor Pagado: " + valuecheckPagaralerta;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alerthourPagaralerta = jsonobject.getString("horaalerta");
                    if(alerthourPagaralerta == "null"){
                        //callbackContext.success("Valueoff horaalerta");
                    }else{
                        text.text="Valido desde: "+ alerthourPagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    limithourPagaralerta = jsonobject.getString("horalimite");
                    if(limithourPagaralerta == "null"){
                        //callbackContext.success("Valueoff horalimite");
                    }else{
                        text.text="Valido hasta: " + limithourPagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    endhourPagaralerta = jsonobject.getString("horafin");
                    if(endhourPagaralerta == "null"){
                        //callbackContext.success("Valueoff horafin");
                    }else{
                        text.text="Hora Fin: " + endhourPagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    zonePagaralerta = jsonobject.getString("zona");
                    if(zonePagaralerta == "null"){
                        //callbackContext.success("Valueoff zona");
                    }else{
                        text.text="Zona: " + zonePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alertidPagaralerta = jsonobject.getString("idalerta");
                    if(alertidPagaralerta == "null"){
                        //callbackContext.success("Valueoff idalerta");
                    }else{
                        text.text="IdAlerta: " + alertidPagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    saleidPagaralerta = jsonobject.getString("idventa");
                    if(saleidPagaralerta == "null"){
                        //callbackContext.success("Valueoff idventa");
                    }else{
                        text.text="Consecutivo: " + saleidPagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractionvaluePagaralerta = jsonobject.getString("valorfraccion");
                    if(fractionvaluePagaralerta == "null"){
                        //callbackContext.success("Valueoff valorfraccion");
                    }else{
                        text.text="Valor: " + fractionvaluePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractiontimePagaralerta = jsonobject.getString("tiempofraccion");
                    if(fractiontimePagaralerta == "null"){
                        //callbackContext.success("Valueoff tiempofraccion");
                    }else{
                        text.text="Tarifa: " + fractiontimePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    observationonePagaralerta = jsonobject.getString("observacion1");
                    if(observationonePagaralerta == "null"){
                        //callbackContext.success("Valueoff observacion1");
                    }else{
                        text.text=observationonePagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    observationsecondPagaralerta = jsonobject.getString("observacion2");
                    if(observationsecondPagaralerta == "null"){
                        //callbackContext.success("Valueoff observacion1");
                    }else{
                        text.text=observationsecondPagaralerta;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    recommendationnamePagaralerta = jsonobject.getString("nombrerecomendaciones");
                    if(recommendationnamePagaralerta == "null"){
                        //callbackContext.success("Valueoff nombrerecomendaciones");
                    }else{
                        text.text=recommendationnamePagaralerta;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    recommendationtextPagaralerta = jsonobject.getString("textorecomendaciones");
                    if(recommendationtextPagaralerta == "null"){
                        //callbackContext.success("Valueoff textorecomendaciones");
                    }else{
                        text.text = recommendationtextPagaralerta;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    footeronePagaralerta = jsonobject.getString("pie1");
                    if(footeronePagaralerta == "null"){
                        //callbackContext.success("Valueoff pie1");
                    }else{
                        text.text=footeronePagaralerta;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    footersecondPagaralerta = jsonobject.getString("pie2");
                    if(footersecondPagaralerta == "null"){
                        //callbackContext.success("Valueoff pie2");
                    }else{
                        text.text=footersecondPagaralerta;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                }
            }catch(Exception e){
                callbackContext.error(e.toString());
            }
            //--------------------------------------------------------------------------------------
            PrintRespCode printRespCode = print.startPrint();
            callbackContext.success(printRespCode.toString());
        }else if(action.equals("printDuplicadoGenerarAlerta")){
            vacio = out;
            Printer2 print = Printer2.getInstance();
            TextEntity text =  new TextEntity(vacio, null, false, null);
            //TextEntity textOne =  new TextEntity(" ", null, false, null);
            print.appendTextEntity2(text);

            String titleDupliGenerarAlerta = new String();
            String subtitleDupliGenerarAlerta = new String();
            String ubicationDupliGenerarAlerta = new String();
            String nitDupliGenerarAlerta = new String();
            String addressDupliGenerarAlerta = new String();
            String phonenumberDupliGenerarAlerta = new String();
            String ticketnameDupliGenerarAlerta = new String();
            String alertdateDupliGenerarAlerta = new String();
            String alerthourDupliGenerarAlerta = new String();
            String licenseplateDupliGenerarAlerta = new String();
            String zoneDupliGenerarAlerta = new String();
            String alertidDupliGenerarAlerta = new String();
            String fractiontimeDupliGenerarAlerta = new String();
            String fractionvalueDupliGenerarAlerta = new String();
            String observationoneDupliGenerarAlerta = new String();
            String observationsecondDupliGenerarAlerta = new String();
            String recommendationnameDupliGenerarAlerta = new String();
            String recommendationtextDupliGenerarAlerta = new String();
            String footeroneDupliGenerarAlerta = new String();
            String footersecondDupliGenerarAlerta = new String();

            JSONArray obj = new JSONArray();
            obj = args;
            try{
                for(int i = 0; i < obj.length(); i++) {
                    JSONObject jsonobject = obj.getJSONObject(i);
                    //------------------------------------------------------------------------------
                    titleDupliGenerarAlerta = jsonobject.getString("titulo");
                    if (titleDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff titulo");
                    } else {
                        text.text = titleDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    subtitleDupliGenerarAlerta = jsonobject.getString("subtitulo");
                    if (subtitleDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff subtitulo");
                    } else {
                        text.text = subtitleDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    ubicationDupliGenerarAlerta = jsonobject.getString("ubicacion");
                    if (ubicationDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff ubicacion");
                    } else {
                        text.text = ubicationDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    nitDupliGenerarAlerta = jsonobject.getString("nit");
                    if (nitDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff nit");
                    } else {
                        text.text = "NIT : " + nitDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    addressDupliGenerarAlerta = jsonobject.getString("direccion");
                    if (addressDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff direccion");
                    } else {
                        text.text = "DIR : " + addressDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    phonenumberDupliGenerarAlerta = jsonobject.getString("telefono");
                    if (phonenumberDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff telefono");
                    } else {
                        text.text = "TEL : " + phonenumberDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    ticketnameDupliGenerarAlerta = jsonobject.getString("nombrerecibo");
                    if (ticketnameDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff nombrerecibo");
                    } else {
                        text.text = ticketnameDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    alertdateDupliGenerarAlerta = jsonobject.getString("fechaalerta");
                    if (alertdateDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff fechalerta");
                    } else {
                        text.text = "Fecha Alerta: " + alertdateDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alerthourDupliGenerarAlerta = jsonobject.getString("horaalerta");
                    if (alerthourDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff horaalerta");
                    } else {
                        text.text = "Hora : " + alerthourDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    licenseplateDupliGenerarAlerta = jsonobject.getString("placa");
                    if (licenseplateDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff placa");
                    } else {
                        text.text = "PLACA: " + licenseplateDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    zoneDupliGenerarAlerta = jsonobject.getString("zona");
                    if (zoneDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff zona");
                    } else {
                        text.text = "Zona: " + zoneDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alertidDupliGenerarAlerta = jsonobject.getString("idalerta");
                    if (alertidDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff idalerta");
                    } else {
                        text.text = "Consecutivo: " + alertidDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractiontimeDupliGenerarAlerta = jsonobject.getString("tiempofraccion");
                    if (fractiontimeDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff tiempofraccion");
                    } else {
                        text.text = "Fraccion: " + fractiontimeDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractionvalueDupliGenerarAlerta = jsonobject.getString("valorfraccion");
                    if (fractionvalueDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff valorfraccion");
                    } else {
                        text.text = "Valor: " +  fractionvalueDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    observationoneDupliGenerarAlerta = jsonobject.getString("observacion1");
                    if (observationoneDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff observacion1");
                    } else {
                        text.text = observationoneDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    observationsecondDupliGenerarAlerta = jsonobject.getString("observacion2");
                    if (observationsecondDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff observacion1");
                    } else {
                        text.text = observationsecondDupliGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    recommendationnameDupliGenerarAlerta = jsonobject.getString("nombrerecomendaciones");
                    if (recommendationnameDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff nombrerecomendaciones");
                    } else {
                        text.text = recommendationnameDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    recommendationtextDupliGenerarAlerta = jsonobject.getString("textorecomendaciones");
                    if (recommendationtextDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff textorecomendaciones");
                    } else {
                        text.text = recommendationtextDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    footeroneDupliGenerarAlerta = jsonobject.getString("pie1");
                    if (footeroneDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff pie1");
                    } else {
                        text.text = footeroneDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    footersecondDupliGenerarAlerta = jsonobject.getString("pie2");
                    if (footersecondDupliGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff pie2");
                    }else {
                        text.text = footersecondDupliGenerarAlerta;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    text.text = "";
                    text.align = Align.CENTER;
                    text.engfontsize = FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                }
            }catch (Exception e){
                callbackContext.error(e.toString());
            }
            //------------------------------------------------------------------------------
            PrintRespCode printRespCode = print.startPrint();
            callbackContext.success(printRespCode.toString());
            //Log.i("PrintActivity", printRespCode.toString().toString());
        }else if(action.equals("printDuplicadoPrepago")){
            vacio = out;
            Printer2 print = Printer2.getInstance();
            TextEntity text =  new TextEntity(vacio, null, false, null);
            //TextEntity textOne =  new TextEntity(" ", null, false, null);
            print.appendTextEntity2(text);

            String titleDupliPrepa = new String();
            String subtitleDupliPrepa = new String();
            String ubicationDupliPrepa = new String();
            String nitDupliPrepa = new String();
            String addressDupliPrepa = new String();
            String phonenumberDupliPrepa = new String();
            String ticketnameDupliPrepa = new String();
            String alertdateDupliPrepa = new String();
            String limitdateDupliPrepa = new String();
            String saledateDupliPrepa = new String();
            String actualhourDupliPrepa = new String();
            String licenseplateDupliPrepa = new String();
            String timeDupliPrepa = new String();
            String valuecheckDupliPrepa = new String();
            String alerthourDupliPrepa = new String();
            String limithourDupliPrepa = new String();
            String endhourDupliPrepa = new String();
            String zoneDupliPrepa = new String();
            String saleidDupliPrepa = new String();
            String alertidDupliPrepa = new String();
            String fractionvalueDupliPrepa = new String();
            String fractiontimeDupliPrepa = new String();
            String observationoneDupliPrepa = new String();
            String observationsecondDupliPrepa = new String();
            String recommendationnameDupliPrepa = new String();
            String recommendationtextDupliPrepa = new String();
            String footeroneDupliPrepa = new String();
            String footersecondDupliPrepa = new String();

            JSONArray obj = new JSONArray();
            obj = args;
            try{
                for(int i = 0; i < obj.length(); i++){
                    JSONObject jsonobject = obj.getJSONObject(i);
                    //------------------------------------------------------------------------------
                    titleDupliPrepa = jsonobject.getString("titulo");
                    if(titleDupliPrepa == "null"){
                        //callbackContext.success("Valueoff titulo");
                    }else {
                        text.text = titleDupliPrepa;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    subtitleDupliPrepa = jsonobject.getString("subtitulo");
                    if(subtitleDupliPrepa == "null"){
                        //callbackContext.success("Valueoff subtitulo");
                    }else {
                        text.text = subtitleDupliPrepa;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        text.newline = true;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    ubicationDupliPrepa = jsonobject.getString("ubicacion");
                    if(ubicationDupliPrepa == "null"){
                        //callbackContext.success("Valueoff ubicacion");
                    }else{
                        text.text = ubicationDupliPrepa;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    nitDupliPrepa = jsonobject.getString("nit");
                    if(nitDupliPrepa == "null"){
                        //callbackContext.success("Valueoff nit");
                    }else {
                        text.text = "NIT : " + nitDupliPrepa;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    addressDupliPrepa = jsonobject.getString("direccion");
                    if(addressDupliPrepa == "null"){
                        //callbackContext.success("Valueoff direccion");
                    }else {
                        text.text = "DIR : " + addressDupliPrepa;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    phonenumberDupliPrepa = jsonobject.getString("telefono");
                    if(phonenumberDupliPrepa == "null"){
                        //callbackContext.success("Valueoff telefono");
                    }else {
                        text.text = "TEL : " + phonenumberDupliPrepa;
                        text.isBoldFont = true;
                        text.engFontType = FontType.MSGOTHIC;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    ticketnameDupliPrepa = jsonobject.getString("nombrerecibo");
                    if(ticketnameDupliPrepa == "null"){
                        //callbackContext.success("Valueoff nombrerecibo");
                    }else {
                        text.text = ticketnameDupliPrepa;
                        text.isBoldFont = true;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.CENTER;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    alertdateDupliPrepa = jsonobject.getString("fecharecibo");
                    if(alertdateDupliPrepa == "null"){
                        //callbackContext.success("Valueoff fecharecibo");
                    }else{
                        text.text="Fecha Recibo: " + alertdateDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                     alertdateDupliPrepa = jsonobject.getString("fechaventa");
                     if(alertdateDupliPrepa == "null"){
                         //callbackContext.success("Valueoff fechaventa");
                     }else{
                     text.text="Fecha Venta: " + alertdateDupliPrepa;
                     text.isBoldFont=false;
                     text.engFontType= FontType.FZZDX;
                     text.align= Align.LEFT;
                     text.engfontsize=FontLattice.TWENTY_FOUR;
                     print.appendTextEntity2(text);
                     }
                    //------------------------------------------------------------------------------
                    limitdateDupliPrepa = jsonobject.getString("fecha_limite");
                    if(limitdateDupliPrepa == "null"){
                        //callbackContext.success("Valueoff fecha_limite");
                    }else{
                        text.text="Fecha Limite: "+limitdateDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    saledateDupliPrepa = jsonobject.getString("fechaventa");
                    if(saledateDupliPrepa == "null"){
                        //callbackContext.success("Valueoff fechaventa");
                    }else{
                        text.text="Fecha Pago: "+saledateDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    actualhourDupliPrepa = jsonobject.getString("horaactual");
                    if(actualhourDupliPrepa == "null"){
                        //callbackContext.success("Valueoff horaactual");
                    }else{
                        text.text="Hora: " + actualhourDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    licenseplateDupliPrepa =  jsonobject.getString("placa");
                    if(licenseplateDupliPrepa == "null"){
                        //callbackContext.success("Valueoff placa");
                    }else{
                        text.text="PLACA: " + licenseplateDupliPrepa;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    timeDupliPrepa = jsonobject.getString("tiempo");
                    if(timeDupliPrepa == "null"){
                        //callbackContext.success("Valueoff tiempo");
                    }else{
                        text.text="Tiempo: "+timeDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    valuecheckDupliPrepa = jsonobject.getString("valor_pagado");
                    if(valuecheckDupliPrepa == "null"){
                        //callbackContext.success("Valueoff valorpagado");
                    }else{
                        text.text="Valor Pagado: " + valuecheckDupliPrepa;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.THIRTY_TWO;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alerthourDupliPrepa = jsonobject.getString("horaalerta");
                    if(alerthourDupliPrepa == "null"){
                        //callbackContext.success("Valueoff horaalerta");
                    }else{
                        text.text="Valido desde: "+alerthourDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    limithourDupliPrepa = jsonobject.getString("horalimite");
                    if(limithourDupliPrepa == "null"){
                        //callbackContext.success("Valueoff horalimite");
                    }else{
                        text.text="Valido hasta: " + limithourDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    endhourDupliPrepa = jsonobject.getString("horafin");
                    if(endhourDupliPrepa == "null"){
                        //callbackContext.success("Valueoff horafin");
                    }else{
                        text.text="Hora Fin: " + endhourDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    zoneDupliPrepa = jsonobject.getString("zona");
                    if(zoneDupliPrepa == "null"){
                        //callbackContext.success("Valueoff zona");
                    }else{
                        text.text="Zona: " + zoneDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    /*alertidDupliPrepa = jsonobject.getString("idalerta");
                    if(alertidDupliPrepa == "null"){
                        //callbackContext.success("Valueoff idalerta");
                    }else{
                        text.text="IdAlerta: " + alertidDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }*/
                    //------------------------------------------------------------------------------
                    saleidDupliPrepa = jsonobject.getString("idventa");
                    if(saleidDupliPrepa == "null"){
                        //callbackContext.success("Valueoff idventa");
                    }else{
                        text.text="Consecutivo: " + saleidDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractionvalueDupliPrepa = jsonobject.getString("valorfraccion");
                    if(fractionvalueDupliPrepa == "null"){
                        //callbackContext.success("Valueoff valorfraccion");
                    }else{
                        text.text="Valor: "+fractionvalueDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    fractiontimeDupliPrepa = jsonobject.getString("tiempofraccion");
                    if(fractiontimeDupliPrepa == "null"){
                        //callbackContext.success("Valueoff tiempofraccion");
                    }else{
                        text.text="Tarifa: " + fractiontimeDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    observationoneDupliPrepa = jsonobject.getString("observacion1");
                    if(observationoneDupliPrepa == "null"){
                        //callbackContext.success("Valueoff observacion1");
                    }else{
                        text.text=observationoneDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    observationsecondDupliPrepa = jsonobject.getString("observacion2");
                    if(observationsecondDupliPrepa == "null"){
                        //callbackContext.success("Valueoff observacion1");
                    }else{
                        text.text=observationsecondDupliPrepa;
                        text.isBoldFont=false;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.TWENTY_FOUR;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    recommendationnameDupliPrepa = jsonobject.getString("nombrerecomendaciones");
                    if(recommendationnameDupliPrepa == "null"){
                        //callbackContext.success("Valueoff nombrerecomendaciones");
                    }else{
                        text.text=recommendationnameDupliPrepa;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    recommendationtextDupliPrepa = jsonobject.getString("textorecomendaciones");
                    if(recommendationtextDupliPrepa == "null"){
                        //callbackContext.success("Valueoff textorecomendaciones");
                    }else{
                        text.text = recommendationtextDupliPrepa;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    footeroneDupliPrepa = jsonobject.getString("pie1");
                    if(footeroneDupliPrepa == "null"){
                        //callbackContext.success("Valueoff pie1");
                    }else{
                        text.text=footeroneDupliPrepa;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.SIXTEEN;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    footersecondDupliPrepa = jsonobject.getString("pie2");
                    if(footersecondDupliPrepa == "null"){
                        //callbackContext.success("Valueoff pie2");
                    }else{
                        text.text=footersecondDupliPrepa;
                        text.isBoldFont=true;
                        text.engFontType= FontType.FZZDX;
                        text.align= Align.CENTER;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                    //------------------------------------------------------------------------------
                    text.text="";
                    text.align= Align.CENTER;
                    text.engfontsize=FontLattice.SIXTEEN;
                    print.appendTextEntity2(text);
                }
            }catch(Exception e){
                callbackContext.error(e.toString());
            }
            //--------------------------------------------------------------------------------------
            PrintRespCode printRespCode = print.startPrint();
            callbackContext.success(printRespCode.toString());
        }
        return true;
    }
}