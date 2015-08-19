/**
 * Created by gleb on 19.08.15.
 */

getResponse();

var resultPerPage = httpGet('/data/resultPerPage');

function httpGet(theUrl) {
    var xmlHttp = new XMLHttpRequest();
    xmlHttp.open("GET", theUrl, false); // false for synchronous request
    xmlHttp.send(null);
    return xmlHttp.responseText;
}

function getResponse(url) {
    var xmlhttp = new XMLHttpRequest();
    if (typeof url === 'undefined') {
        url = "/data/orders";
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            if (xmlhttp.responseText != "") {
                var myArr = JSON.parse(xmlhttp.responseText);
                parseOrders(myArr);
            }
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}

function parseOrders(arr) {
    var firstIndex = httpGet('/data/firstIndex');
    document.getElementById("next").disabled = arr.length < resultPerPage;
    document.getElementById("back").disabled = firstIndex == 0;
    var i;
    var out = '<table>';
    out += '<tr>';
    out += '<td>Id</td>';
    out += '<td>Description</td>';
    out += '<td>Date</td>';
    out += '<td>Price</td>';
    out += '<td>Customer</td>';
    out += '</tr>';
    for (i = 0; i < arr.length; i++) {
        out += '<tr>';
        out += '<td>' + arr[i].id + '</td>';
        out += '<td>' + arr[i].description + '</td>';
        out += '<td>' + arr[i].dateIns + '</td>';
        out += '<td>' + arr[i].price + '</td>';
        out += '<td>' + arr[i].customerId + '</td>';
        out += '</tr>';
    }
    out += '</table>';
    document.getElementById("table").innerHTML = out;
}