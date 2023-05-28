package ma.enset.ebankingbackend.dtos;

import lombok.Data;

import java.util.List;

@Data
public class AccountHistoryDTO {
    private String ID;
    private String RIB;
    private double balance;
    private String type;


    private int currentPage;
    private int totalPages;
    private int size;

    private List<AccountOperationDTO> operations;
}
