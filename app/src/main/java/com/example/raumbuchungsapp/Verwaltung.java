package com.example.raumbuchungsapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.sql.Time;
import java.util.Collection;

import java.sql.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Verwaltung
{
    List<Buchung> buchungsliste = new List<Buchung>()
    {
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
        public Iterator<Buchung> iterator() {
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
        public boolean add(Buchung buchung) {
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
        public boolean addAll(@NonNull Collection<? extends Buchung> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Buchung> c) {
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
        public Buchung get(int index) {
            return null;
        }

        @Override
        public Buchung set(int index, Buchung element) {
            return null;
        }

        @Override
        public void add(int index, Buchung element) {

        }

        @Override
        public Buchung remove(int index) {
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
        public ListIterator<Buchung> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Buchung> listIterator(int index) {
            return null;
        }

        @NonNull
        @Override
        public List<Buchung> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    List<Raum> raumliste = new List<Raum>() {
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
        public Iterator<Raum> iterator() {
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
        public boolean add(Raum raum) {
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
        public boolean addAll(@NonNull Collection<? extends Raum> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, @NonNull Collection<? extends Raum> c) {
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
        public Raum get(int index) {
            return null;
        }

        @Override
        public Raum set(int index, Raum element) {
            return null;
        }

        @Override
        public void add(int index, Raum element) {

        }

        @Override
        public Raum remove(int index) {
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
        public ListIterator<Raum> listIterator() {
            return null;
        }

        @NonNull
        @Override
        public ListIterator<Raum> listIterator(int index) {

            return null;
        }

        @NonNull
        @Override
        public List<Raum> subList(int fromIndex, int toIndex) {
            return null;
        }


    };

    public Verwaltung(List<Raum> raumliste)
    {
        this.raumliste = raumliste;
    }

    public boolean IstRaumFrei(Raum raum, Date zeitvon, Date zeitbis)
    {
        boolean frei = true;
        for (Buchung b : buchungsliste) {
            if (b.raum == raum && zeitvon.before(b.zeitbis) && zeitbis.after(b.zeitvon))
            {
                return frei = false;
            }
            else
            {
                break;
            }
        }

        return frei;
    }

    public boolean Raeumebuchen(User user, Raum raum, Date zeitvon, Date zeitbis)
    {
        if (!IstRaumFrei(raum, zeitvon, zeitbis))
        {
            return false;
        }
        buchungsliste.add(new Buchung(user, raum, zeitvon, zeitbis));
        return true;
    }

    public boolean RaeumeAnlegen(Admin admin, Raum raum, String raumname, int ID)
    {
        if (raumliste.contains(raum))
        {
            return false;
        }
        raumliste.add(new Raum(raumname, ID));
        return true;
    }

    public boolean RaeumeEntfernen(Admin admin, Raum raum)
    {
        if(!raumliste.contains(raum))
        {
            return false;
        }
        raumliste.remove(raum);
        return true;
    }

    public boolean Buchungstornieren(User user, Buchung buchung)
    {
        for (Buchung b: buchungsliste)
        {
            if(buchung == b)
            {
                buchungsliste.remove(buchung);
                return true;
            }
        }
        return false;
    }

}
