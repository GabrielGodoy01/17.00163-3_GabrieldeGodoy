package br.maua.Controller;

import br.maua.Model.PokCarta;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;

import javafx.scene.image.ImageView;

public class Controller {

    @FXML
    private TextField txtNome, txtId, txtRaridade, txtSerie, txtColecao, txtUrl;
    @FXML
    private ImageView imgFoto;

    @FXML
    private Button btnFoto;

    @FXML
    public void cadastrar(){
        PokCarta pokCarta = new PokCarta(txtNome.getText(), txtId.getText(), txtRaridade.getText(), txtSerie.getText(), txtColecao.getText(), txtUrl.getText());
        txtNome.clear();
        txtId.clear();
        txtRaridade.clear();
        txtSerie.clear();
        txtColecao.clear();
        txtUrl.clear();
        System.out.println("Usuário Cadastrado: " + pokCarta);
    }

    @FXML
    public void previewPhoto(){
        try {
            String url =txtUrl.getText();
            Image image = new Image(url);
            imgFoto.setImage(image);
        }
        catch (IllegalArgumentException exception){
            txtUrl.clear();
            txtUrl.requestFocus();
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("URL Incorreta");
            alert.setHeaderText("Cuidado!");
            alert.showAndWait();
            alert.show();
        }
    }
}
