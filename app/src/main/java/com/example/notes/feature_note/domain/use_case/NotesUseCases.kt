package com.example.notes.feature_note.domain.use_case

data class NotesUseCases(
    val getNotesUseCase: GetNotesUseCase,
    val deleteNote: DeleteNote,
    val addNote: AddNote
) {
}