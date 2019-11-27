package classes;

import javax.swing.JButton;

/**
 * @author matheus
 */
public class Arduino {
  private Controle arduino;
  
  
  public Arduino(){
      arduino = new Controle("/dev/ttyACM0",9600);
  }    

  /**
   * Envia o comando para a porta serial
   * @param button - Botão que é clicado na interface Java
   */
  public void comunicacaoArduino(JButton button) {        
    if("Ligar".equals(button.getActionCommand())){
      arduino.enviaDados(1);
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
    else if("Desligar".equals(button.getActionCommand())){
      arduino.enviaDados(2);
      System.out.println(button.getText());
    }
    else{
      arduino.close();
      System.out.println(button.getText());//Imprime o nome do botão pressionado
    }
  }
}
