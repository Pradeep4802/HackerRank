console.log("Hello Duniya!!!");

let btn = document.getElementById("priBtn");
btn.addEventListener("", loadDoc(myFunction1));

// loadDoc("url-2", myFunction2);

function loadDoc(cFunction) {
  let xhr = new XMLHttpRequest();
  //   xhr.open("GET", "simple.json", true);
  //   xhr.onprogress = function () {
  //     console.log("On progress");
  //   };
  //   xhr.onload = function () {
  //     if (this.status == 200) {
  //       console.log(this.responseText);
  //     } else {
  //       console.log("Some error occurred");
  //     }
  //   };

//   xhr.open("GET", "https://api.github.com/users/wesbos", true);
  xhr.open("GET", "catalog.xml", true);
//   xhr.getResponseHeader("Content-type", "application/json");
  xhr.onreadystatechange = function () {
    if (this.readyState == 4 && this.status == 200) {
      cFunction(this);
    }
  };

  xhr.send();
}

function myFunction1(xhr) {
  // action goes here
  console.log(xhr.responseXML);
}
function myFunction2(xhttp) {
  // action goes here
  console.log("No good");
}
