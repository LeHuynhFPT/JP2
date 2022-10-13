package BaiTap;



import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public  void  initialize(URL location, ResourceBundle resources){

    }


    public void btnMember() throws Exception {
        btnMember(null);
    }

    public void btnMember(ActionEvent ignoredActionEvent) throws Exception{
        Parent listPage= FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../Member/member.fxml")));
        Scene listScene = new Scene(listPage,800,600);
        Stage newStage = new Stage();
        Main.rootStage.setTitle("danh sách thành viên");
        Main.rootStage.setScene(listScene);
    }

    public void btnBook() throws Exception{
        Parent listPage= FXMLLoader.load(getClass().getResource("../Book/book.fxml"));
        Scene listScene = new Scene(listPage,800,600);
        Stage newStage = new Stage();
        Main.rootStage.setTitle("sửa môn học");
        Main.rootStage.setScene(listScene);
    }

    public void btnBooks() throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../BorrowBook/brBook.fxml"));
        Main.rootStage.setScene(new Scene(root, 1100, 650));
    }


}
