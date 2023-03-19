// package oop;

// import java.util.ArrayList;
// import java.util.List;

// public class Customer {
//     private String name;
//     private String email;
//     private String phoneNumber;
//     private List<ArtPiece> purchasedArtPieces;
    
//     public Customer(String name, String email, String phoneNumber) {
//         this.name = name;
//         this.email = email;
//         this.phoneNumber = phoneNumber;
//         this.purchasedArtPieces = new ArrayList<>();
//     }
//     public String getName() {
//         return name;
//     }
//     public String getEmail() {
//         return email;
//     }
//     public String getPhoneNumber() {
//         return phoneNumber;
//     }
//     public void purchaseArtPiece(ArtPiece artPiece) {
//         purchasedArtPieces.add(artPiece);
//         artPiece.setAvailable(false);
//     }
//     public List<ArtPiece> getPurchasedArtPieces() {
//         return purchasedArtPieces;
//     }
//     public double getBalance() {
//         return 0;
//     }
//     public void debit(double totalPrice) {
//     }
// }

