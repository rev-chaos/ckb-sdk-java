package mercury;

import java.io.IOException;
import model.CreateAssetAccountPayload;
import model.GetBalancePayload;
import model.TransferPayload;
import model.resp.GetBalanceResponse;
import model.resp.TransactionCompletionResponse;

public interface MercuryApi {

  GetBalanceResponse getBalance(GetBalancePayload payload) throws IOException;

  TransactionCompletionResponse buildTransferTransaction(TransferPayload payload)
      throws IOException;

  TransactionCompletionResponse buildAssetAccountCreationTransaction(
      CreateAssetAccountPayload payload) throws IOException;
}
