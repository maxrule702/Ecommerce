var buttons = document.getElementsByClassName("change-image")[0];
var index = 0;

buttons.addEventListener('click',function() {
    if(index === imageSources.length ) {
        index = 0;
    }
    document.getElementById("image").src = imageSources[index];
    index++;
});