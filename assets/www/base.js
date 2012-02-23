var onDeviceReady = function() {
    document.getElementById("devready").innerHTML = "OnDeviceReady fired.";
        window.requestFileSystem(LocalFileSystem.PERSISTENT, 0, gotFS, fail);
};

function sampleButton() {
    alert("Sample Button fires an alert.");
}

function init() {
    document.addEventListener("deviceready", onDeviceReady, true);
}