const express = require ('express');
const app = express();
app.use (express.json());

app.get('/lembretes', (req, res) => {

});

app.post('/eventos', (req, res) => {

});

app.listen(7000, () => console.log('Microsserviço consulta. Porta 7000'));
