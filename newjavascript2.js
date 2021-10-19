/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


HTTP/1.1 200 OK
Content-Type: text/xml; charset=utf-8
Content-Length: length

<?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <NumberToWordsResponse xmlns="http://www.dataaccess.com/webservicesserver/">
      <NumberToWordsResult>string</NumberToWordsResult>
    </NumberToWordsResponse>
  </soap:Body>
</soap:Envelope>