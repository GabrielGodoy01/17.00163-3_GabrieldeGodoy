const express = require("express");
const axios = require("axios");
const app = express();
app.use(express.json());

const palavraChave = "importante";

const funcoes = {
  ObservacaoCriada: (observacao) => {
    observacao.status = observacao.texto.includes(palavraChave)
      ? "importante"
      : "comum";
    axios.post("http://localhost:6000/eventos", {
      tipo: "ObservacaoClassificada",
      dados: observacao,
    });
  },
};

app.post("/eventos", (req, res) => {
  try {
    funcoes[req.body.tipo](req.body.dados);
  } catch (err) {}
  res.status(200).send({ msg: "Ok" });
});

app.listen(8000, () => console.log("Classificação. Porta 8000."));
