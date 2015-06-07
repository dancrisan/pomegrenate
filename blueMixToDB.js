var cps = require('cps-api');
//Example : var cpsConn = new cps.Connection('tcp://cloud-us-0.clusterpoint.com:9007', 'My_DB_name', 'bob@gmail.com', '12345678', 'document', 'document/id', {account: 100337}); 
var cpsConn = new cps.Connection('tcp://cloud-us-0.clusterpoint.com:9007', 'DATABASE_NAME', 'EMAIL', 'PASSWORD', 'document', 'document/id', {account: ACCOUNT_ID_NUMBER}); 

var id = 1,
   name = "Username";
var insert_request = new cps.InsertRequest('<document><id>'+id+'</id>'+cps.Term(name, "name")+'</document>');
cpsConn.sendRequest(insert_request, function(err, insert_response) {
   if (err) return console.error(err);
   console.log('New user registered: ' + insert_response.document.id);
});