var http = require('http');

function onRequest(request, response) {
    response.writeHead(200, {'Content-Type': 'text/plain'});
    response.write('Hello World, Great?');
    response.end();
}

http.createServer(onRequest).listen(4567);
console.log('Server has started.');
