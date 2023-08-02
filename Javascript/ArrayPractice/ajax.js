console.log("Ajax in one video");

let fetchBtn = document.getElementById("fetchBtn");
fetchBtn.addEventListener("click", buttonClickHandler);

function buttonClickHandler() {
  console.log("You have clicked the fetchBtn");
  // Instantiate an xhr object
  const xhr = new XMLHttpRequest();

  // Open the object
  xhr.open('GET', 'simple.json', true);

  // USE this for POST request
//   xhr.open("POST", "https://dummy.restapiexample.com/api/v1/create", true);
//   xhr.getResponseHeader("Content-type", "application/json");

  // what to do on progress (optional)
  xhr.onprogress = function () {
    console.log("On progress");
  };

  // xhr.onreadystatechange = function() {
  //     console.log('ready state is  ',xhr.readyState);
  // }

  // what to do when response is ready
  xhr.onload = function () {
    if (this.status == 200) {
      console.log(this.responseText);
    } else {
      console.log("Some error occurred");
    }
  };

  // send the request
//   params = `{"name":"test4566","salary":"123","age":"23"}`;
//   xhr.send(params);
  xhr.send();

  console.log("We are done!!");
}

let popBtn = document.getElementById("popBtn");
popBtn.addEventListener("click", popHandler);

function popHandler() {
  console.log("You have clicked the pop handler");
  // Instantiate an xhr object
  const xhr = new XMLHttpRequest();

  // Open the object
//   xhr.open('GET', 'console.log("You have clicked the fetchBtn");

  // Open the object
  xhr.open('GET', 'https://dummy.restapiexample.com/api/v1/employees', true);

  // USE this for POST request
//   xhr.open("POST", "https://dummy.restapiexample.com/api/v1/employees", true);
//   xhr.getResponseHeader("Content-type", "application/json");


  // what to do when response is ready
//   xhr.onload = function() {
//     if (this.status == 200) {
//       let obj = JSON.parse(this.responseText);
//       console.log(obj);
//       let list = document.getElementById('list');
//       str = "";
//       for (key in obj) {
//         str += `<li>${obj[key].employee_name} </li>`;
//       }
//       list.innerHTML = str;
//     } else {
//       console.log("Some error occurred");
//     }
//   };

//   xhr.send();
//   console.log("We are done fetching employee");
}
