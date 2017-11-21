module.exports = (function(){

    var verificarPlugin = function(args, successCallback, errorCallback){
        cordova.exec(successCallback, errorCallback, "print", "verificarPluginJava", [args]);};

    var imprimirPrepago = function(args,successCallback, errorCallback){
        cordova.exec(successCallback, errorCallback, "print", "printPrepago", [args]);};

    var imprimirGenerarAlerta = function(args,successCallback, errorCallback){
        cordova.exec(successCallback, errorCallback, "print", "printGenerarAlerta", [args]);};

    var imprimirPagaralerta = function(args,successCallback, errorCallback){
        cordova.exec(successCallback, errorCallback, "print", "printPagaralerta", [args]);};

    return {
        imprimirPrepago:imprimirPrepago,
        verificarPlugin:verificarPlugin,
        imprimirGenerarAlerta:imprimirGenerarAlerta,
        imprimirPagaralerta:imprimirPagaralerta
    };

})();