package model.resp;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/** @author zjh @Created Date: 2021/7/20 @Description: @Modify by: */
public class GenericTransactionResponse {
  @SerializedName("tx_hash")
  public String txHash;

  public List<OperationResponse> operations;
}
