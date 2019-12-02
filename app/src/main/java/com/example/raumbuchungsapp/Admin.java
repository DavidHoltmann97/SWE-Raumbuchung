// Kommentarzeile

/*

Multiple Kommentarzeilen hier

 */

package com.example.raumbuchungsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Admin extends User
{
    public Admin(String Benutzername, String Passwort, int ID, int Matrikelnummer)
    {
        super(Benutzername, Passwort, ID, Matrikelnummer);
    }

    List<User> Benutzerliste = new List<User>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(@Nullable Object o) {
            return false;
        }

        @NonNull
        @Override
        public Iterator<User> iterator() {
            return null;
        }

        @NonNull
        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @NonNull
        @Override
        public <T> T[] toArray(@NonNull T[] a) {
            return null;
        }

        @Override
        public boolean add(User user) {
            return false;
        }

        @Override
        public boolean remove(@Nullable Object o) {
            return false;
        }

        @Override
        public boolean containsAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(@NonNull Collection<? extends User> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends User> c) {
            return false;
        }

        @Override
        public boolean removeAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(@NonNull Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public User get(int index) {
            return null;
        }

        @Override
        public User set(int index, User element) {
            return null;
        }

        @Override
        public void add(int index, User element) {

        }

        @Override
        public User remove(int index) {
            return null;
        }

        @Override
        public int indexOf(@Nullable Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(@Nullable Object o) {
            return 0;
        }

        @NonNull
        @Override
        public ListIterator<User> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<User> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<User> subList(int fromIndex, int toIndex) {
            return null;
        }
    };
    public void Benutzeranlegen(User user)
    {
        if (!Benutzerliste.contains(user))
        {
            Benutzerliste.add(user);
        }
        System.out.println("Benutzer wurde bereits angelegt.");
    }
    public void Benutzerloeschen(User user)
    {
        if (!Benutzerliste.contains(user))
        {
            System.out.println("Benutzer wurde nicht gefunden und kann nicht gelöscht werden.");
        }
        Benutzerliste.remove(user);
    }
}

