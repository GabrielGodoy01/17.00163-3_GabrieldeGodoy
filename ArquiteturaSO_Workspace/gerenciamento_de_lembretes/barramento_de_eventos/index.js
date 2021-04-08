const express = require('express');
const app = express();

app.use(express.json());
const axios = require('axios');

app.post('/eventos', (req, res) => {
    const evento = req.body;
    console.log(evento);
    //envia o evento para o microsseviço de lembretes
    axios.post('http://localhost:4000/eventos', evento);
    //envia o evento para o microsserviço de Observações
    axios.post('http://localhost:5000/eventos', evento);
    res.status(200).send({msg: 'ok '});
});

app.listen(6000, () => console.log('Microsserviço Event Bus. Porta 10000'));