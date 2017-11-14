module.exports = (function(){

    var verificarPlugin = function(args, successCallback, errorCallback){
        cordova.exec(successCallback, errorCallback, "print", "verificarPluginJava", [args]);};

    var imprimir = function(args, successCallback, errorCallback){
        cordova.exec(successCallback, errorCallback, "print", "printinTerminal", [args]);};

    return {
        printFunction:imprimir,
        verificarPlugin:verificarPlugin
    };


})();