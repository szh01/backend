package coms.softra.RestfulWebService;

import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface FundtransferIDao {
	public List<Fundtransfer> findByfundTransferId(String sd, String ed);
}
