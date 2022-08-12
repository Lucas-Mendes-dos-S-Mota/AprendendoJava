package Familia57;

public class Dadoscliente {
	public static void main(String args[]) {
		
		Cliente cliente1 = new Cliente("Lucas Mendes","500,00","5");
		Cliente cliente2 = new Cliente("Moises Mota", "740,00","25"); 
		
		System.out.print("Cliente(a): "+cliente1.getNomecliente());
		System.out.println("\nSaldo da carteira: "+cliente1.getSaldoDaCarteira()+" Reais");
		System.out.printf("\nSeu carrinho está com: "+cliente1.getCarrinhodeCompra()+" itens");
		
		System.out.println("\n \n");
		
		System.out.println("\nCliente(a): "+cliente2.getNomecliente());
		System.out.println("\nSaldo da carteira: "+cliente2.getSaldoDaCarteira()+" Reais");
		System.out.printf("\nSeu carrinho está com: "+cliente2.getCarrinhodeCompra()+" itens");
	}

}
