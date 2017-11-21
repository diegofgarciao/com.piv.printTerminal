
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
                        text.text=alertdatePrint;
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
                        text.text=limitdatePrint;
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
                        text.text=saledatePrint;
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
                        text.text=actualhourPrint;
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
                        text.text=licenseplatePrint;
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
                        text.text=timePrint;
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
                        text.text=valuecheckPrint;
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
                        text.text=timePrint;
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
                        text.text=timePrint;
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
                        text.text=timePrint;
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
                        text.text=zonePrint;
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
                        text.text=alertidPrint;
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
                        text.text=saleidPrint;
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
                        text.text=fractionvaluePrint;
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
                        text.text=fractiontimePrint;
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
                        text.align= Align.LEFT;
                        text.engfontsize=FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    observationsecondPrint = jsonobject.getString("observacion1");
                    if(observationsecondPrint == "null"){
                        //callbackContext.success("Valueoff observacion1");
                    }else{
                        text.text=observationsecondPrint;
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
            }
            catch(Exception e){
                callbackContext.error(e.toString());
            }
            //------------------------------------------------------------------------------
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
                    }else {
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
                        text.text = alertdateGenerarAlerta;
                        text.isBoldFont = false;
                        text.engFontType = FontType.FZZDX;
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    alerthourGenerarAlerta = jsonobject.getString("horaactual");
                    if (alerthourGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff horaactual");
                    } else {
                        text.text = alerthourGenerarAlerta;
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
                        text.text = licenseplateGenerarAlerta;
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
                        text.text = zoneGenerarAlerta;
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
                        text.text = alertidGenerarAlerta;
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
                        text.text = fractiontimeGenerarAlerta;
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
                        text.text = fractionvalueGenerarAlerta;
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
                        text.align = Align.LEFT;
                        text.engfontsize = FontLattice.TWENTY_FOUR;
                        print.appendTextEntity2(text);
                    }
                    //------------------------------------------------------------------------------
                    observationsecondGenerarAlerta = jsonobject.getString("observacion1");
                    if (observationsecondGenerarAlerta == "null") {
                        //callbackContext.success("Valueoff observacion1");
                    } else {
                        text.text = observationsecondGenerarAlerta;
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
                    } else {
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
        }
        return true;
    }
}