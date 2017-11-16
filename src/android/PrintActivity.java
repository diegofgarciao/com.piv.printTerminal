package com.piv.print;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;
import android.util.Log;
import android.*;

import android.app.Activity;
import android.os.Bundle;
/*import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;*/

import com.socsi.smartposapi.printer.Align;
import com.socsi.smartposapi.printer.FontLattice;
import com.socsi.smartposapi.printer.PrintRespCode;
import com.socsi.smartposapi.printer.Printer2;
import com.socsi.smartposapi.printer.TextEntity;


public class PrintActivity extends CordovaPlugin {

private CallbackContext callbackContext;
private String vuelta = "PIVPluginPrintVerificado";
private String rta;

    @Override
        public boolean execute(String action, final JSONArray args, CallbackContext callbackContext){

            if(action.equals("verificarPluginJava")){
                rta = args + vuelta;
                callbackContext.success(rta);
            }

            else if (action.equals("printinTerminal")) {

                Printer2 print = Printer2.getInstance();

                TextEntity text =  new TextEntity("Texto prueba", null, false, null);
                //TextEntity textOne =  new TextEntity(" ", null, false, null);
                print.appendTextEntity2(text);

                text.text="Texto prueba 2";
                text.isBoldFont=true;
                print.appendTextEntity2(text);

                     text.text="Centrado";
                     text.align= Align.CENTER;
                     text.engfontsize=FontLattice.SIXTEEN;
                     print.appendTextEntity2(text);

                     text.text="Centrado1";
                     text.align= Align.RIGHT;
                     text.engfontsize=FontLattice.TWENTY_FOUR;
                     print.appendTextEntity2(text);

                     text.text="Centrado2";
                     text.align= Align.LEFT;
                     text.engfontsize=FontLattice.FORTY_EIGHT;
                     print.appendTextEntity2(text);

                     text.text="Centrado3";
                     text.align= Align.CENTER;
                     text.engfontsize=FontLattice.TWENTY_FOUR;
                     print.appendTextEntity2(text);

                     text.text="Centrado4";
                     text.align= Align.RIGHT;
                     text.engfontsize=FontLattice.THIRTY_TWO;
                     print.appendTextEntity2(text);

                     text.text="Centrado5";
                     text.align= Align.CENTER;
                     text.engfontsize=FontLattice.FORTY_EIGHT;
                     print.appendTextEntity2(text);

                     text.text="Centrado6";
                     text.align= Align.RIGHT;
                     text.engfontsize=FontLattice.SIXTEEN;
                     print.appendTextEntity2(text);

                     text.text="Centrado7";
                     text.align= Align.LEFT;
                     text.engfontsize=FontLattice.TWENTY_FOUR;
                     print.appendTextEntity2(text);

                     text.text="Centrado8";
                     text.align= Align.CENTER;
                     text.engfontsize=FontLattice.EIGHT;
                     print.appendTextEntity2(text);

                     text.text="Centrado9";
                     text.align= Align.RIGHT;
                     text.engfontsize=FontLattice.FORTY_EIGHT;
                     print.appendTextEntity2(text);

                PrintRespCode printRespCode = print.startPrint();
                callbackContext.success(printRespCode.toString());
                //Log.i("PrintActivity", printRespCode.toString().toString());
             }
            return true;
        }
}