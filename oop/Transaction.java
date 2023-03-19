// package oop;

// import java.time.LocalDateTime;

// public class Transaction {
//     private int transactionId;
//     private LocalDateTime dateTime;
//     private ArtPiece artPiece;
//     private Customer customer;
//     private PaymentInformation paymentInformation;
//     private double totalPrice;

//     public Transaction(int transactionId, LocalDateTime dateTime, ArtPiece artPiece, Customer customer,
//         PaymentInformation paymentInformation, double totalPrice) {
//         this.transactionId = transactionId;
//         this.dateTime = dateTime;
//         this.artPiece = artPiece;
//         this.customer = customer;
//         this.paymentInformation = paymentInformation;
//         this.totalPrice = totalPrice;
//     }
//     public int getTransactionId() {
//         return transactionId;
//     }
//     public LocalDateTime getDateTime() {
//         return dateTime;
//     }
//     public ArtPiece getArtPiece() {
//         return artPiece;
//     }
//     public Customer getCustomer() {
//         return customer;
//     }
//     public PaymentInformation getPaymentInformation() {
//         return paymentInformation;
//     }
//     public double getTotalPrice() {
//         return totalPrice;
//     }
//     public static void addTransaction(Transaction transaction) {
//     }
// }