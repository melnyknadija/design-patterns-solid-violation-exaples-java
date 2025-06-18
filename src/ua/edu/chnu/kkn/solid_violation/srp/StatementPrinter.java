package ua.edu.chnu.kkn.solid_violation.srp;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.LinkedList;

public class StatementPrinter {
    private static final String STATEMENT_HEADER = "DATE | AMOUNT | BALANCE";
    private final Console console;
    private final Formatter formatter;

    public StatementPrinter(Console console, Formatter formatter) {
        this.console = console;
        this.formatter = formatter;
    }

    public void print(List<Transaction> transactions) {
        console.printLine(STATEMENT_HEADER);
        final AtomicInteger balance = new AtomicInteger(0);
        transactions.stream()
                .map(transaction -> formatStatementLine(transaction, balance.addAndGet(transaction.amount())))
                .collect(Collectors.toCollection(LinkedList::new))
                .descendingIterator()
                .forEachRemaining(console::printLine);
    }

    private String formatStatementLine(Transaction transaction, int balance) {
        return String.format("%s | %s | %s",
                formatter.formatDate(transaction.date()),
                formatter.formatAmount(transaction.amount()),
                formatter.formatAmount(balance));
    }
}
