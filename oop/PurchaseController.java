// package oop;
// import java.time.LocalDateTime;

// public class PurchaseController<ArtPieceRepository, CustomerRepository, TransactionRepository> {
//     private ArtPieceRepository artPieceRepository;
//     private CustomerRepository customerRepository;
//     private TransactionRepository transactionRepository;

//     public PurchaseController(ArtPieceRepository artPieceRepository, CustomerRepository customerRepository,
//         TransactionRepository transactionRepository) {
//         this.artPieceRepository = artPieceRepository;
//         this.customerRepository = customerRepository;
//         this.transactionRepository = transactionRepository;
//     }

//     public boolean purchaseArtPiece(ArtPiece artPiece, Customer customer, PaymentInformation paymentInformation) {
//         // Check if art piece is available
//         if (!artPiece.isAvailable()) {
//             return false;
//         }

//         // Check if customer has enough funds to purchase art piece
//         if (customer.getBalance() < artPiece.getPrice()) {
//             return false;
//         }

//         // Make transaction
//         int transactionId = transactionRepository.getNextTransactionId();
//         LocalDateTime dateTime = LocalDateTime.now();
//         double totalPrice = artPiece.getPrice();
//         Transaction transaction = new Transaction(transactionId, dateTime, artPiece, customer, paymentInformation, totalPrice);
//         Transaction.addTransaction(transaction);

//         // Update art piece and customer information
//         artPiece.setAvailable(false);
//         customer.debit(totalPrice);

//         return true;
//     }
// }