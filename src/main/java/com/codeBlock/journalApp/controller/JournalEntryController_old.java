//Id type is changed from Long to String, that's why giving error

/*package com.blockCode.journalApp.controller;

import com.blockCode.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/_journal")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntries= new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll()
    {
        return new ArrayList<>(journalEntries.values());

    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry journalEntry)
    {
        journalEntries.put(journalEntry.getId(),journalEntry);
        return true;
    }

    @GetMapping("id/{id}")
    public JournalEntry getJournalEntryById(@PathVariable Long id)
    {
        return journalEntries.get(id);
    }

    @DeleteMapping("id/{id}")
    public JournalEntry deleteJournalEntryById(@PathVariable Long id)
    {
        return journalEntries.remove(id);
    }

    @PutMapping("/id/{id}")
    public JournalEntry updateJournalEntryById(@PathVariable Long id, @RequestBody JournalEntry journalEntry)
    {
        return journalEntries.put(id,journalEntry);
    }
}
*/